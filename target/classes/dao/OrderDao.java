/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Customer;
import entity.Employee;
import entity.Order;
import entity.OrderDelivery;
import entity.OrderTime;
import entity.Table;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.neo4j.driver.AccessMode;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.types.Node;

public class OrderDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    //Mở kết nối đến database
    public OrderDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.WRITE).withDatabase(dbName).build();
    }

    public LinkedHashMap<String, Long> top10SanPhamBanTheoThang(int thang, int nam) {
        String query = "MATCH (o:Order)-[:CONTAINS]->(od:OrderDetail)\n"
                + "WHERE datetime(o.ngayTao) >= datetime({year: $nam1, month: $m, day: 1}) \n"
                + "  AND datetime(o.ngayTao) < datetime({year: $nam2, month: $m2, day: 1})\n"
                + "RETURN od.tenMon, COUNT(od) AS count\n"
                + "ORDER BY count DESC\n"
                + "LIMIT 10";
        Map<String, Object> params = Map.of("nam1", nam, "m", thang, "nam2", nam + 1, "m2", thang);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query, params);
                return result.stream()
                        .collect(Collectors.toMap(record -> record.get("od.tenMon").asString(),
                                record -> record.get("count").asLong(),
                                (existing, replacement) -> existing,
                                LinkedHashMap::new));
            });
        }
    }


    public double tongTienHoaDonTheoNgay(String ngay) {
        String query = "MATCH (o:Order)\n"
                + "WHERE date(o.ngayTao) = date($n) AND o.trangThai = 4\n"
                + "RETURN sum(o.tongTien) as total";
        Map<String, Object> params = Map.of("n", ngay);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.single().get("total").asDouble();
                    }
            );
        }
    }

    //===================================================================================================\\
    public String layBaSoCuoiCuaMaHoaDonTheoNgay(String ngay) {

        String query = "MATCH (n:Order)\n"
                + "WHERE n.maHD STARTS WITH $ma\n"
                + "WITH n, substring(n.maHD, size(n.maHD) - 3, 3) AS BaSoCuoi\n"
                + "RETURN BaSoCuoi\n"
                + "ORDER BY BaSoCuoi DESC\n"
                + "LIMIT 1";
        Map<String, Object> params = Map.of("ma", "HD" + ngay);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext()) {
                            return result.single().get("BaSoCuoi").asString();
                        } else {
                            return null;
                        }
                    }
            );
        }
    }

    //===================================================================================================\\
    public List<Order> getTatCaHoaDon() {
        String query = "MATCH (hd:Order) WHERE hd.trangThai = 4 OR hd.trangThai = 3 return hd LIMIT 25";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query);
                return result
                        .stream()
                        .map(
                                record -> {
                                    Node node = record.get("hd").asNode();
                                    Table t = new Table();
                                    Customer customer = new Customer();
                                    customer.setSoDienThoai(node.get("khachHang").asString());
                                    t.setSoBan(node.get("soBan").asString());
                                    return new Order(node.get("maHD").asString(), node.get("ngayTao").asLocalDateTime(), customer,
                                            new Employee(node.get("nhanVien").asString()),
                                            node.get("tongTien").asDouble(),
                                            t, node.get("trangThai").asInt());
                                }).toList();
            });
        }
    }

    //===================================================================================================\\
    public List<Order> getTatCaHoaDonTuNgayDen(LocalDateTime ngayBD, LocalDateTime ngayKT) {
        String query = "MATCH (o:Order)\n"
                + "WHERE o.ngayTao >= $nbd AND o.ngayTao <= $nkt AND (o.trangThai = 4 OR o.trangThai = 3)\n"
                + "RETURN o";
        Map<String, Object> params = Map.of("nbd", ngayBD, "nkt", ngayKT);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query, params);
                return result.stream().map(record -> {
                    Node node = record.get("o").asNode();
                    Table t = new Table();
                    Customer customer = new Customer();
                    customer.setSoDienThoai(node.get("khachHang").asString());
                    t.setSoBan(node.get("soBan").asString());
                    return new Order(node.get("maHD").asString(),
                            node.get("ngayTao").asLocalDateTime(),
                            customer,
                            new Employee(node.get("nhanVien").asString()),
                            node.get("tongTien").asDouble(),
                            t,
                            node.get("trangThai").asInt());
                }).toList();
            });
        }
    }

    //===================================================================================================\\
    public List<Order> getTatCaHoaDonTongTienTuDen(double tu, double den) {
        String query = "MATCH (o:Order)\n"
                + "WHERE o.tongTien >= $nbd AND o.tongTien <= $nkt \n"
                + "RETURN o";
        Map<String, Object> params = Map.of("nbd", tu, "nkt", den);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query, params);
                return result
                        .stream()
                        .map(
                                record -> {
                                    Node node = record.get("o").asNode();
                                    Table t = new Table();
                                    Customer customer = new Customer();
                                    customer.setSoDienThoai(node.get("khachHang").asString());
                                    t.setSoBan(node.get("soBan").asString());
                                    return new Order(node.get("maHD").asString(), node.get("ngayTao").asLocalDateTime(), customer,
                                            new Employee(node.get("nhanVien").asString()),
                                            node.get("tongTien").asDouble(),
                                            t, node.get("trangThai").asInt());
                                }).toList();
            });
        }
    }

    //===================================================================================================\\
    public void luuHoaDonBanMangDi(Order o) {
        String query = "CREATE (o:Order {maHD: $ma, ngayTao: $nt, nhanVien :$nv,trangThai : $tt,diaChi : 'Trống', ghiChu : 'Trống', khachHang : $kh,soBan: $sb})";
        String soBan;
        if (o.getBan() == null) {
            soBan = "Trống";
        } else {
            soBan = o.getBan().getSoBan();
        }
        Map<String, Object> params = Map.of("ma", o.getMaHD(),
                "nt", o.getNgayTaoHD(),
                "tt", o.getTrangThai(),
                "nv", o.getNhanVien().getMaNhanVien(),
                "kh", "Khách vãng lai",
                "sb", soBan);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    public void luuHoaDonDatBan(OrderTime o) {
        String query = "CREATE (o:Order {maHD: $ma, ngayTao: $nt, nhanVien :$nv,trangThai : 6,diaChi : 'Trống', ghiChu : 'Trống', khachHang : $kh,soBan: $sb,thoiGianDat : $tgd, thoiGianNhan :$tgn})";

        Map<String, Object> params = Map.of("ma", o.getMaHD(),
                "nt", o.getNgayTaoHD(),
                "tt", o.getTrangThai(),
                "nv", o.getNhanVien().getMaNhanVien(),
                "kh", o.getKhachHang().getSoDienThoai(),
                "sb", o.getBan().getSoBan(),
                "tgd", o.getNgayDat(),
                "tgn", o.getNgayNhan());
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    public Order timHoaDonTheoBan(String maBan, int trangThai) {
        String query = "MATCH (o:Order)\n"
                + "WHERE o.soBan = $sb AND o.trangThai = $tt return o";
        Map<String, Object> params = Map.of("sb", maBan, "tt", trangThai);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("o").asNode();
                        Table t = new Table();
                        t.setSoBan(node.get("soBan").asString());
                        return new Order(node.get("maHD").asString(),
                                node.get("ngayTao").asLocalDateTime(), new Customer(node.get("khachHang").asString()), new Employee(node.get("nhanVien").asString()),
                                t, node.get("trangThai").asInt());
                    });
        }
    }

    //===================================================================================================\\
    public void upDateSoBan(String maHD, String soBan) {
        String query = "MATCH (n:Order {maHD : $ma})SET n.soBan = $sb";
        Map<String, Object> params = Map.of("ma", maHD, "sb", soBan);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }
//===================================================================================================\\

    public void upDateNgayTao(String maHD, LocalDateTime ngayTao) {
        String query = "MATCH (n:Order {maHD : $ma})SET n.ngayTao = $nt";
        Map<String, Object> params = Map.of("ma", maHD, "nt", ngayTao);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }
//===================================================================================================\\

    public Order timHoaDonTheoMa(String mahoadon) {
        String query = "MATCH (o:Order)\n"
                + "WHERE o.maHD = $m return o";
        Map<String, Object> params = Map.of("m", mahoadon);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("o").asNode();
                        Table t = new Table();
                        Customer customer = new Customer();
                        customer.setSoDienThoai(node.get("khachHang").asString());
                        t.setSoBan(node.get("soBan").asString());
                        return new Order(node.get("maHD").asString(), node.get("ngayTao").asLocalDateTime(), customer,
                                t, node.get("trangThai").asInt());
                    });
        }
    }
    //===================================================================================================\\

    public void updateTrangThaiHoaDon(String maHD, int trangThai, double tongTien) {
        String query = "MATCH (n:Order {maHD : $ma}) SET n.trangThai = $tt, n.tongTien = $tien";
        Map<String, Object> params = Map.of("ma", maHD, "tt", trangThai, "tien", tongTien);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    /*
    CREATE FULLTEXT INDEX text_index_Order FOR (o:Order) ON EACH [o.maHD, o.khachHang, o.nhanVien, o.diaChi]
     */
    public List<Order> findOrder(String tim) {
        String query = "CALL db.index.fulltext.queryNodes('text_index_Order', $name) YIELD node RETURN node";
        Map<String, Object> params = Map.of("name", "*" + tim + "*");
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("node").asNode();

                                    Table t = new Table();
                                    Customer customer = new Customer();
                                    customer.setSoDienThoai(node.get("khachHang").asString());
                                    t.setSoBan(node.get("soBan").asString());
                                    return new Order(node.get("maHD").asString(), node.get("ngayTao").asLocalDateTime(), customer,
                                            new Employee(node.get("nhanVien").asString()), t, node.get("trangThai").asInt());
                                }).toList();
                    });
        }
    }

    //===================================================================================================\\
    public void updateTrangThaiHoaDonDatBan(String maHD, int trangThai) {
        String query = "MATCH (n:Order {maHD : $ma}) SET n.trangThai = $tt";
        Map<String, Object> params = Map.of("ma", maHD, "tt", trangThai);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    //===================================================================================================\\
    public OrderDelivery timHoaDonDatHangTheoMa(String mahoadon) {
        String query = "MATCH (o:Order)\n"
                + "WHERE o.maHD = $m return o";
        Map<String, Object> params = Map.of("m", mahoadon);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("o").asNode();
                        Table t = new Table();
                        t.setSoBan(node.get("soBan").asString());
                        return new OrderDelivery(node.get("diaChi").asString(),
                                node.get("ghiChu").asString(),
                                node.get("maHD").asString(),
                                node.get("ngayTao").asLocalDateTime(),
                                new Customer(node.get("khachHang").asString()),
                                new Employee(node.get("nhanVien").asString()),
                                node.get("trangThai").asInt());
                    });
        }
    }

    //===================================================================================================\\
    public List<Order> layAllOrderChuaThanhToan() {
        String query = "MATCH (n:Order)\n"
                + "WHERE n.trangThai <> 4 AND n.trangThai <> 6\n"
                + "RETURN n";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("n").asNode();
                                            Table t = new Table();
                                            Customer customer = new Customer();
                                            customer.setSoDienThoai(node.get("khachHang").asString());
                                            t.setSoBan(node.get("soBan").asString());
                                            return new Order(node.get("maHD").asString(), node.get("ngayTao").asLocalDateTime(), customer,
                                                    t, node.get("trangThai").asInt());
                                        }).toList();
                    });
        }
    }

    //===================================================================================================\\
    public void xoaHDTrong(String maHD) {
        String query = "MATCH (n:Order {maHD:$ma}) detach delete n";
        Map<String, Object> params = Map.of("ma", maHD);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    public void luuHoaDonDatHang(OrderDelivery o) {
        String query = "CREATE (o:Order {maHD: $ma, ngayTao: $nt, nhanVien :$nv,trangThai : 2,diaChi : $dc, ghiChu : $gc, khachHang : $kh,soBan: 'Trống'})";
        Map<String, Object> params = Map.of("ma", o.getMaHD(),
                "nt", o.getNgayTaoHD(),
                "nv", o.getNhanVien().getMaNhanVien(),
                "dc", o.getDiaChi(),
                "gc", o.getGhiChu(),
                "kh", o.getKhachHang().getSoDienThoai());
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    public void capNhatHoaDonBanMangDi(Order o) {
        String query = "MATCH(o:Order {maHD :$ma}) SET o.trangThai = 5,o.khachHang = $kh";
        String sdt;
        if (o.getKhachHang().getSoDienThoai().isEmpty()) {
            sdt = "Khách vãng lai";
        } else {
            sdt = o.getKhachHang().getSoDienThoai();
        }
        Map<String, Object> params = Map.of("ma", o.getMaHD(),
                "kh", sdt);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    public void thanhToanHoaDonBanMangDi(Order o) {
        String query = "MATCH(o:Order {maHD :$ma}) SET o.khachHang = $kh, o.trangThai = 4,o.ngayTao = $nt,o.tongTien = $tong, o.tienKhachDua = $tkd,"
                + "o.tienThoi = $tThoi,o.phuongThucThanhToan =$pttt";

        String khachHang;
        if (o.getKhachHang().getSoDienThoai().isEmpty() || o.getKhachHang().getSoDienThoai().equalsIgnoreCase("")) {
            khachHang = "Khách vãng lai";
        } else {
            khachHang = o.getKhachHang().getSoDienThoai();
        }
        Map<String, Object> params = Map.of("ma", o.getMaHD(),
                "kh", khachHang,
                "nt", o.getNgayTaoHD(),
                "tong", o.getThanhToan(),
                "tkd", o.getTienKhachDua(),
                "tThoi", o.getTienThoi(),
                "pttt", o.getPhuongThucThanhToan());
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();
                    });
        }
    }

    //===================================================================================================\\
    //đóng kết nối;
    public void close() {
        driver.close();
    }

}
