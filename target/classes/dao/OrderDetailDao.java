/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Food;
import entity.OrderDetail;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.types.Node;

public class OrderDetailDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    //Mở kết nối đến database
    public OrderDetailDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.WRITE).withDatabase(dbName).build();
    }

    //===================================================================================================\\
    public void taoChiTietHoaDon(OrderDetail od, String maHD) {
        String query = "MATCH (o:Order {maHD: $mahoadon})\n"
                + "CREATE (od:OrderDetail {tenMon:$tenmon, soLuong: $sl, gia: $g, thanhToan: $tt}) <-[:CONTAINS]- (o)";
        Map<String, Object> params = Map.of("mahoadon", maHD, "tenmon", od.getFood().getFoodName(), "sl", od.getSoLuongMua(), "g", od.getFood().getPrice(), "tt", od.getTongTien());
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });

        }
    }

    //===================================================================================================\\
    public void updateSoLuong(String odName, int sLuong, String ma) {
        String query = "MATCH (o:Order {maHD :$mahd})-[r:CONTAINS]->(od:OrderDetail {tenMon: $ten})\n"
                + "SET od.soLuong = $sl, od.thanhToan = $sl2 * od.gia";
        Map<String, Object> params = Map.of("mahd", ma, "ten", odName, "sl", sLuong,"sl2",sLuong);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    //===================================================================================================\\
    public List<OrderDetail> layDanhSachSanPham(String ma) {
        String query = "MATCH (o:Order {maHD :$mahd})-[r:CONTAINS]->(od:OrderDetail)\n"
                + "return od";
        Map<String, Object> params = Map.of("mahd", ma);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result
                                .stream()
                                .map(record -> {
                                    Node node = record.get("od").asNode();
                                    Food f = new Food();
                                    f.setPrice(node.get("gia").asDouble());
                                    f.setFoodName(node.get("tenMon").asString());
                                    return new OrderDetail(f, node.get("soLuong").asInt(), node.get("thanhToan").asDouble());
                                }).toList();
                    });
        }

    }

    //===================================================================================================\\
    public void deleteOrderDetail(String odName, String ma) {
        String query = "MATCH (o:Order {maHD :$mahd})-[r:CONTAINS]->(od:OrderDetail {tenMon: $ten})\n"
                + "DETACH delete od";
        Map<String, Object> params = Map.of("mahd", ma, "ten", odName);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    //===================================================================================================\\
    public void deleteAllOrderDetail(String ma) {
        String query = "MATCH (o:Order {maHD :$mahd})-[r:CONTAINS]->(od:OrderDetail)\n"
                + "DETACH delete od";
        Map<String, Object> params = Map.of("mahd", ma);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    //===================================================================================================\\\
    public OrderDetail timFoodInOrderDetail(String ma, String tenMon) {
        String query = "MATCH (o:Order {maHD :$mahd})-[r:CONTAINS]->(od:OrderDetail {tenMon: $ten})\n"
                + "return od";
        Map<String, Object> params = Map.of("mahd", ma, "ten", tenMon);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("od").asNode();
                        Food f = new Food();
                        f.setPrice(node.get("gia").asDouble());
                        f.setFoodName(node.get("tenMon").asString());
                        return new OrderDetail(f, node.get("soLuong").asInt(), node.get("thanhToan").asDouble());
                    });
        }
//        String maHD, Table ban, int trangThai
    }

    //===================================================================================================\\
    //đóng kết nối;
    public void close() {
        driver.close();
    }
}
