/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Employee;
import java.util.ArrayList;
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
public class EmployeeDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    public EmployeeDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = sessionConfig.builder()
                .withDatabase(dbName)
                .withDefaultAccessMode(AccessMode.WRITE)
                .build();
    }

    public List<Employee> getTatCaNhanVien() {
        String query = "MATCH (e:Employee) return e LIMIT 25";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query);
                if (!result.hasNext()) {
                // Trường hợp không có nhân viên nào
                return new ArrayList<>();
                }
                return result.stream().map(record -> {
                    Node node = record.get("e").asNode();
                    return new Employee(node.get("maNV").asString(),
                            node.get("tenNV").asString(),
                            node.get("gioiTinh").asInt(),
                            node.get("ngaySinh").asLocalDateTime(),
                            node.get("ngayVaoLam").asLocalDateTime(),
                            node.get("email").asString(),
                            node.get("img").asString(),
                            node.get("caLamViec").asString(),
                            node.get("chucVu").asString(),
                            node.get("trangThai").asString(),
                            node.get("soDienThoai").asString(),
                            node.get("luong").asDouble(),
                            node.get("cccd").asString());

                }).toList();
            });
        }
    }

    public boolean themNhanVien(Employee nhanVien) {
        String query = "  CREATE (n:Employee {maNV: $ma, tenNV: $ten, gioiTinh: $gioiTinh, \n"
                + "  ngaySinh: localdatetime({ year: $nam, month: $thang, day: $ngay, hour: $gio, minute: $phut, second: $giay, millisecond: $miliGiay }),\n"
                + "  ngayVaoLam: localdatetime({ year: $nam1, month: $thang1, day: $ngay1, hour: $gio1, minute: $phut1, second: $giay1, millisecond: $miliGiay1 }),\n"
                + "  email: $Email, img: $anhNhanVien, caLamViec: $caLamViec, chucVu: $chucVu, trangThai: $trangThai, soDienThoai: $sdt, luong: $luong, cccd: $cccd}) RETURN n.maNV";

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("ma", nhanVien.getMaNhanVien());
        params.put("ten", nhanVien.getTenNhanVien());
        params.put("gioiTinh", nhanVien.getGioiTinh());

        params.put("nam", nhanVien.getNgaySinh().getYear());
        params.put("thang", nhanVien.getNgaySinh().getMonthValue());
        params.put("ngay", nhanVien.getNgaySinh().getDayOfMonth());
        params.put("gio", nhanVien.getNgaySinh().getHour());
        params.put("phut", nhanVien.getNgaySinh().getMinute());
        params.put("giay", nhanVien.getNgaySinh().getSecond());
        params.put("miliGiay", nhanVien.getNgaySinh().getNano() / 1000000);

        params.put("nam1", nhanVien.getNgayVaoLam().getYear());
        params.put("thang1", nhanVien.getNgayVaoLam().getMonthValue());
        params.put("ngay1", nhanVien.getNgayVaoLam().getDayOfMonth());
        params.put("gio1", nhanVien.getNgayVaoLam().getHour());
        params.put("phut1", nhanVien.getNgayVaoLam().getMinute());
        params.put("giay1", nhanVien.getNgayVaoLam().getSecond());
        params.put("miliGiay1", nhanVien.getNgayVaoLam().getNano() / 1000000);

        params.put("Email", nhanVien.getEmail());
        params.put("anhNhanVien", nhanVien.getAnhNhanVien());
        params.put("caLamViec", nhanVien.getCaLamViec());
        params.put("chucVu", nhanVien.getChucVu());
        params.put("trangThai", nhanVien.getTrangThai());
        params.put("sdt", nhanVien.getSoDienThoai());
        params.put("luong", nhanVien.getLuong());
        params.put("cccd", nhanVien.getCCCD());

        try (Session session = driver.session(sessionConfig)) {
            return session.executeWrite(tx -> {

                Result result = tx.run(query, params);
                String NhanVienThem = result.single().get("n.maNV").asString();
                if (NhanVienThem.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            });
        }
    }

    public String lay3SoCuoiMa(String loai) {
        String query = "MATCH (e:Employee) WHERE e.maNV STARTS WITH $ma WITH e, substring(e.maNV, size(e.maNV) - 3, 3) AS BaSoCuoi RETURN BaSoCuoi ORDER BY BaSoCuoi DESC LIMIT 1";
        Map<String, Object> params = Map.of("ma", loai);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query, params);
                if (result.hasNext()) {
                    return result.single().get("BaSoCuoi").asString();
                } else {
                    return "000";
                }

            });
        }
    }

    public Employee findEmployeeByID(String id) {
        String query = "MATCH (e:Employee) where e.maNV= $ma RETURN e";

        Map<String, Object> params = Map.of("ma", id);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("e").asNode();

                        return new Employee(node.get("maNV").asString(),
                                node.get("tenNV").asString(),
                                node.get("gioiTinh").asInt(),
                                node.get("ngaySinh").asLocalDateTime(),
                                node.get("ngayVaoLam").asLocalDateTime(),
                                node.get("email").asString(),
                                node.get("img").asString(),
                                node.get("caLamViec").asString(),
                                node.get("chucVu").asString(),
                                node.get("trangThai").asString(),
                                node.get("soDienThoai").asString(),
                                node.get("luong").asDouble(),
                                node.get("cccd").asString());

                    });
        }
    }
    
    
     public Employee findEmployeeBySoDienThoai(String sdt) {
        String query = "MATCH (e:Employee) where e.soDienThoai= $dt RETURN e";

        Map<String, Object> params = Map.of("dt", sdt);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("e").asNode();

                        return new Employee(node.get("maNV").asString(),
                                node.get("tenNV").asString(),
                                node.get("gioiTinh").asInt(),
                                node.get("ngaySinh").asLocalDateTime(),
                                node.get("ngayVaoLam").asLocalDateTime(),
                                node.get("email").asString(),
                                node.get("img").asString(),
                                node.get("caLamViec").asString(),
                                node.get("chucVu").asString(),
                                node.get("trangThai").asString(),
                                node.get("soDienThoai").asString(),
                                node.get("luong").asDouble(),
                                node.get("cccd").asString());

                    });
        }
    }

    public void deleteEmployee(String maNV) {
        String query = "MATCH (n:Employee {maNV : $ma}) DETACH delete n";
        Map<String, Object> params = Map.of("ma", maNV);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    public boolean capNhatNhanVien(Employee nhanVien) {

        String query = "MATCH (n:Employee {maNV: $ma}) \n"
                + "SET n.tenNV = $ten, \n"
                + "    n.gioiTinh = $gioiTinh, \n"
                + "    n.ngaySinh = localdatetime({ year: $nam, month: $thang, day: $ngay, hour: $gio, minute: $phut, second: $giay, millisecond: $miliGiay }), \n"
                + "    n.ngayVaoLam = localdatetime({ year: $nam1, month: $thang1, day: $ngay1, hour: $gio1, minute: $phut1, second: $giay1, millisecond: $miliGiay1 }), \n"
                + "    n.email = $Email, \n"
                + "    n.img = $anhNhanVien, \n"
                + "    n.caLamViec = $caLamViec, \n"
                + "    n.chucVu = $chucVu, \n"
                + "    n.trangThai = $trangThai, \n"
                + "    n.soDienThoai = $sdt, \n"
                + "    n.luong = $luong, \n"
                + "    n.cccd = $cccd \n"
                + "RETURN n.maNV as nhanVien";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ma", nhanVien.getMaNhanVien());
        params.put("ten", nhanVien.getTenNhanVien());
        params.put("gioiTinh", nhanVien.getGioiTinh());

        params.put("nam", nhanVien.getNgaySinh().getYear());
        params.put("thang", nhanVien.getNgaySinh().getMonthValue());
        params.put("ngay", nhanVien.getNgaySinh().getDayOfMonth());
        params.put("gio", nhanVien.getNgaySinh().getHour());
        params.put("phut", nhanVien.getNgaySinh().getMinute());
        params.put("giay", nhanVien.getNgaySinh().getSecond());
        params.put("miliGiay", nhanVien.getNgaySinh().getNano() / 1000000);

        params.put("nam1", nhanVien.getNgayVaoLam().getYear());
        params.put("thang1", nhanVien.getNgayVaoLam().getMonthValue());
        params.put("ngay1", nhanVien.getNgayVaoLam().getDayOfMonth());
        params.put("gio1", nhanVien.getNgayVaoLam().getHour());
        params.put("phut1", nhanVien.getNgayVaoLam().getMinute());
        params.put("giay1", nhanVien.getNgayVaoLam().getSecond());
        params.put("miliGiay1", nhanVien.getNgayVaoLam().getNano() / 1000000);

        params.put("Email", nhanVien.getEmail());
        params.put("anhNhanVien", nhanVien.getAnhNhanVien());
        params.put("caLamViec", nhanVien.getCaLamViec());
        params.put("chucVu", nhanVien.getChucVu());
        params.put("trangThai", nhanVien.getTrangThai());
        params.put("sdt", nhanVien.getSoDienThoai());
        params.put("luong", nhanVien.getLuong());
        params.put("cccd", nhanVien.getCCCD());

        try (Session session = driver.session(sessionConfig)) {
            return session.executeWrite(tx -> {

                Result result = tx.run(query, params);
                String nhanVienThem = result.single().get("nhanVien").asString();
                if (nhanVienThem.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            });

        }
    }

    public List<Employee> findEmployee(String tim) {
        String query = "CALL db.index.fulltext.queryNodes('text_index_Employee', $name) YIELD node RETURN node";
        Map<String, Object> params = Map.of("name", "*" + tim + "*");
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("node").asNode();

                                    return new Employee(node.get("maNV").asString(),
                                            node.get("tenNV").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("ngayVaoLam").asLocalDateTime(),
                                            node.get("email").asString(),
                                            node.get("img").asString(),
                                            node.get("caLamViec").asString(),
                                            node.get("chucVu").asString(),
                                            node.get("trangThai").asString(),
                                            node.get("soDienThoai").asString(),
                                            node.get("luong").asDouble(),
                                            node.get("cccd").asString());
                                }).toList();
                    });
        }
    }
    
    
    //Tìm ca làm việc trả về danh sách
    public List<Employee> findEmployeeCaLamViec(String ca) {
        String query = "MATCH (n:Employee {caLamViec:$ca}) return n";
        Map<String, Object> params = Map.of("ca", ca);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("n").asNode();

                                    return new Employee(node.get("maNV").asString(),
                                            node.get("tenNV").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("ngayVaoLam").asLocalDateTime(),
                                            node.get("email").asString(),
                                            node.get("img").asString(),
                                            node.get("caLamViec").asString(),
                                            node.get("chucVu").asString(),
                                            node.get("trangThai").asString(),
                                            node.get("soDienThoai").asString(),
                                            node.get("luong").asDouble(),
                                            node.get("cccd").asString());
                                }).toList();
                    });
        }
    }
    
    //Tìm chức vụ trả về danh sách
    public List<Employee> findEmployeeChucVu(String cv) {
        String query = "MATCH (n:Employee {chucVu:$cv}) return n";
        Map<String, Object> params = Map.of("cv", cv);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("n").asNode();

                                    return new Employee(node.get("maNV").asString(),
                                            node.get("tenNV").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("ngayVaoLam").asLocalDateTime(),
                                            node.get("email").asString(),
                                            node.get("img").asString(),
                                            node.get("caLamViec").asString(),
                                            node.get("chucVu").asString(),
                                            node.get("trangThai").asString(),
                                            node.get("soDienThoai").asString(),
                                            node.get("luong").asDouble(),
                                            node.get("cccd").asString());
                                }).toList();
                    });
        }
    }
    
    //Tìm trạng thái trả về danh sách
    
    public List<Employee> findEmployeeTrangThai(String tt) {
        String query = "MATCH (n:Employee {trangThai:$tt}) return n";
        Map<String, Object> params = Map.of("tt", tt);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("n").asNode();

                                    return new Employee(node.get("maNV").asString(),
                                            node.get("tenNV").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("ngayVaoLam").asLocalDateTime(),
                                            node.get("email").asString(),
                                            node.get("img").asString(),
                                            node.get("caLamViec").asString(),
                                            node.get("chucVu").asString(),
                                            node.get("trangThai").asString(),
                                            node.get("soDienThoai").asString(),
                                            node.get("luong").asDouble(),
                                            node.get("cccd").asString());
                                }).toList();
                    });
        }
    }
    
    //Tìm giới tính trả về danh sách
    
    public List<Employee> findEmployeeGioiTinh(int gt) {
        String query = "MATCH (n:Employee {gioiTinh:$gt}) return n";
        Map<String, Object> params = Map.of("gt", gt);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("n").asNode();

                                    return new Employee(node.get("maNV").asString(),
                                            node.get("tenNV").asString(),
                                            node.get("gioiTinh").asInt(),
                                            node.get("ngaySinh").asLocalDateTime(),
                                            node.get("ngayVaoLam").asLocalDateTime(),
                                            node.get("email").asString(),
                                            node.get("img").asString(),
                                            node.get("caLamViec").asString(),
                                            node.get("chucVu").asString(),
                                            node.get("trangThai").asString(),
                                            node.get("soDienThoai").asString(),
                                            node.get("luong").asDouble(),
                                            node.get("cccd").asString());
                                }).toList();
                    });
        }
    }
    
    
    public Employee findEmployeeByPhone(String phone) {
        String query = "MATCH (e:Employee) where e.soDienThoai= $p RETURN e";

        Map<String, Object> params = Map.of("p", phone);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("e").asNode();

                        return new Employee(node.get("maNV").asString(),
                                node.get("tenNV").asString(),
                                node.get("gioiTinh").asInt(),
                                node.get("ngaySinh").asLocalDateTime(),
                                node.get("ngayVaoLam").asLocalDateTime(),
                                node.get("email").asString(),
                                node.get("img").asString(),
                                node.get("caLamViec").asString(),
                                node.get("chucVu").asString(),
                                node.get("trangThai").asString(),
                                node.get("soDienThoai").asString(),
                                node.get("luong").asDouble(),
                                node.get("cccd").asString());
                    });
        }
    }
}
