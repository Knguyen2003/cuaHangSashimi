/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Customer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.types.Node;

/**
 *
 * @author PC
 */
public class CustomerDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    public CustomerDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = sessionConfig.builder()
                .withDatabase(dbName)
                .withDefaultAccessMode(AccessMode.WRITE)
                .build();
    }
    //=========================================================================//
    //===============================Thống kê==================================//
    public int soKhachHang() {
        String query = "MATCH (p:Customer) RETURN COUNT(p) AS totalKH";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result.single().get("totalKH").asInt();
                    }
            );
        }
    }
    
    
    
    //========================================================================//

    public boolean themKhachHang(Customer khachHang) {

        String query = "CREATE (k:Customer {maKH: $ma, tenKH: $ten, gioiTinh: $gioiTinh, ngaySinh: localdatetime({ year: $nam, month: $thang, day: $ngay, hour: $gio, minute: $phut, second: $giay, millisecond: $miliGiay }), soDienThoai:$sdt, diemTichLuy:0}) return k.maKH as khachHang";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ma", khachHang.getMaKhachHang());
        params.put("ten", khachHang.getTenKhachHang());
        params.put("gioiTinh", khachHang.getGioiTinh());
        params.put("nam", khachHang.getNgaySinh().getYear());
        params.put("thang", khachHang.getNgaySinh().getMonthValue());
        params.put("ngay", khachHang.getNgaySinh().getDayOfMonth());
        params.put("gio", khachHang.getNgaySinh().getHour());
        params.put("phut", khachHang.getNgaySinh().getMinute());
        params.put("giay", khachHang.getNgaySinh().getSecond());
        params.put("miliGiay", khachHang.getNgaySinh().getNano() / 1000000);
        params.put("sdt", khachHang.getSoDienThoai());
        try (Session session = driver.session(sessionConfig)) {
            return session.executeWrite(tx -> {

                Result result = tx.run(query, params);
                String khachHangThem = result.single().get("khachHang").asString();
                if (khachHangThem.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            });

        }
    }

    public String lay4SoCuoiMa() {
        String query = "MATCH (c:Customer) WITH c ORDER BY c.maKH DESC LIMIT 1 RETURN RIGHT(c.maKH, 4) AS ma";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query);
                if (result.hasNext()) {
                    return result.single().get("ma").asString();
                } else {
                    return "0000";
                }

            });
        }
    }

    public List<Customer> getTatCaKhachHang() {
        String query = "MATCH (c:Customer) return c LIMIT 25";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query);
                return result.stream().map(record -> {
                    Node node = record.get("c").asNode();
                    return new Customer(node.get("maKH").asString(), node.get("tenKH").asString(),
                            node.get("gioiTinh").asInt(), node.get("ngaySinh").asLocalDateTime(), node.get("soDienThoai").asString(), node.get("diemTichLuy").asDouble());
                }).toList();
            });
        }
    }

    public Customer findCustomerByID(String id) {
        String query = "MATCH (c:Customer) where c.maKH= $ma RETURN c";

        Map<String, Object> params = Map.of("ma", id);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("c").asNode();

                        return new Customer(node.get("maKH").asString(),
                                node.get("tenKH").asString(),
                                node.get("gioiTinh").asInt(),
                                node.get("ngaySinh").asLocalDateTime(),
                                node.get("soDienThoai").asString(),
                                node.get("diemTichLuy").asDouble());

                    });
//            String maKhachHang, String tenKhachHang, int gioiTinh, LocalDateTime ngaySinh, String soDienThoai, double diemTichLuy
        }
    }
    
    
    
    public Customer findCustomerByPhone(String phone) {
        String query = "MATCH (c:Customer) where c.soDienThoai= $p RETURN c";

        Map<String, Object> params = Map.of("p", phone);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("c").asNode();

                        return new Customer(node.get("maKH").asString(),
                                node.get("tenKH").asString(),
                                node.get("gioiTinh").asInt(),
                                node.get("ngaySinh").asLocalDateTime(),
                                node.get("soDienThoai").asString(),
                                node.get("diemTichLuy").asDouble());

                    });
//            String maKhachHang, String tenKhachHang, int gioiTinh, LocalDateTime ngaySinh, String soDienThoai, double diemTichLuy
        }
    }
    
    

    public boolean capNhatKhachHang(Customer khachHang) {

        String query = "MATCH (c:Customer {maKH: $ma})\n"
                + "SET c.tenKH = $ten, c.gioiTinh = $gioiTinh, c.ngaySinh = localdatetime({ year: $nam, month: $thang, day: $ngay, hour: $gio, minute: $phut, second: $giay, millisecond: $miliGiay }), c.soDienThoai = $sdt\n"
                + "RETURN c.maKH as khachHang";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ma", khachHang.getMaKhachHang());
        params.put("ten", khachHang.getTenKhachHang());
        params.put("gioiTinh", khachHang.getGioiTinh());
        params.put("nam", khachHang.getNgaySinh().getYear());
        params.put("thang", khachHang.getNgaySinh().getMonthValue());
        params.put("ngay", khachHang.getNgaySinh().getDayOfMonth());
        params.put("gio", khachHang.getNgaySinh().getHour());
        params.put("phut", khachHang.getNgaySinh().getMinute());
        params.put("giay", khachHang.getNgaySinh().getSecond());
        params.put("miliGiay", khachHang.getNgaySinh().getNano() / 1000000);
        params.put("sdt", khachHang.getSoDienThoai());
        try (Session session = driver.session(sessionConfig)) {
            return session.executeWrite(tx -> {

                Result result = tx.run(query, params);
                String khachHangThem = result.single().get("khachHang").asString();
                if (khachHangThem.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            });

        }
    }
    /*
    CREATE FULLTEXT INDEX text_index_customer for (c:Customer) on EACH [c.tenKH,c.soDienThoai,c.soDienThoai]
    */
    public List<Customer> findCustomer(String tim) {
        String query = "CALL db.index.fulltext.queryNodes('text_index_customer', $name) YIELD node RETURN node";
        Map<String, Object> params = Map.of("name", "*"+tim+"*");
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("node").asNode();

                                    return new Customer(node.get("maKH").asString(),
                                            node.get("tenKH").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("soDienThoai").asString(),
                                            node.get("diemTichLuy").asDouble());
                                }).toList();
                    });
        }
    }
    
    
    public void updateDiemTichLuy(String maKH, double diemTichLuy) {
        String query = "MATCH (n:Customer {maKH : $ma}) SET n.diemTichLuy =$diem";
        Map<String, Object> params = Map.of("ma", maKH, "diem",diemTichLuy);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    public void close() {
        driver.close();
    }
}
