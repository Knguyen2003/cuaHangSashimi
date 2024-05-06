/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Food;
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
 * @author ACER
 */
public class FoodDao {

    private final Driver driver;
    private final SessionConfig sessionConfig;

    //Mở kết nối đến database
    public FoodDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.WRITE).withDatabase(dbName).build();
    }

    //===================================================================================================\\
    /**
     * Load toàn bộ danh sách món ăn
     */
    public List<Food> getAllFood() {
        String query = "MATCH (t:Food) RETURN t";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("t").asNode();
                                            String trangThai = " ";
                                            if (node.get("trangThai").asInt() == 1) {
                                                trangThai = "Đang Kinh Doanh";
                                            } else {
                                                trangThai = "Ngừng kinh doanh";
                                            }
                                            return new Food(node.get("foodID").asString(),
                                                    node.get("foodName").asString(),
                                                    node.get("price").asDouble(),
                                                    node.get("img").asString(),
                                                    node.get("soLuong").asInt(),
                                                    trangThai);

//					String foodID, String foodName, double price, String img, int soLuong, String trangThai
                                        }).toList();
                    });
        }
    }

    public List<Food> getAllFoodLimit20() {
        String query = "MATCH (t:Food) RETURN t limit 20";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("t").asNode();
                                            String trangThai = " ";
                                            if (node.get("trangThai").asInt() == 1) {
                                                trangThai = "Còn";
                                            } else if (node.get("trangThai").asInt() == 2) {
                                                trangThai = "Hết";
                                            } else {
                                                trangThai = "Ngừng kinh doanh";
                                            }
                                            return new Food(node.get("foodID").asString(),
                                                    node.get("foodName").asString(),
                                                    node.get("price").asDouble(),
                                                    node.get("img").asString(),
                                                    node.get("soLuong").asInt(),
                                                    trangThai);

//					String foodID, String foodName, double price, String img, int soLuong, String trangThai
                                        }).toList();
                    });
        }
    }

    /*
     CREATE FULLTEXT INDEX text_index_food FOR (f: Food) ON EACH [f.foodID, f.foodName]
     */
    public List<Food> findFood(String tim) {
        String query = "CALL db.index.fulltext.queryNodes('text_index_food', $name) YIELD node RETURN node";
        Map<String, Object> params = Map.of("name", "*" + tim + "*");
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("node").asNode();
                                    String trangThai;
                                    if (node.get("trangThai").asInt() == 1) {
                                        trangThai = "Đang Kinh Doanh";
                                    } else {
                                        trangThai = "Ngừng Kinh Doanh";
                                    }
                                    return new Food(node.get("foodID").asString(),
                                            node.get("foodName").asString(),
                                            node.get("price").asDouble(),
                                            node.get("img").asString(),
                                            node.get("soLuong").asInt(),
                                            trangThai);
                                }).toList();
                    });
        }
    }

    public boolean themThucDon(Food f, String c) {
        String query = "MATCH (c:Category {categoryID: $idDM}) CREATE (f1:Food {foodID: $id, foodName: $name, price:$gia, img:$anh, soLuong:$soLuong, trangThai:$tThai}) -[:BELONG_TO]-> (c) return f1.foodID";

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("idDM", c);
        params.put("id", f.getFoodID());
        params.put("name", f.getFoodName());

        params.put("gia", f.getPrice());
        params.put("anh", f.getImg());
        params.put("soLuong", f.getSoLuong());
        if (f.getTrangThai().equalsIgnoreCase("Đang Kinh Doanh")) {
            params.put("tThai", 1);
        } else {
            params.put("tThai", 2);
        }

        try (Session session = driver.session(sessionConfig)) {
            return session.executeWrite(tx -> {

                Result result = tx.run(query, params);
                String foodThem = result.single().get("f.foodID").asString();
                if (foodThem.isEmpty()) {
                    return false;
                } else {
                    return true;
                }
            });
        }
    }

    //===================================================================================================\\
    public List<Food> getFoodByCategoryName(String name) {
        String query = "MATCH (f:Food)-[r:BELONG_TO]->(c:Category) where c.categoryName = $ten RETURN f";
        Map<String, Object> params = Map.of("ten", name);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("f").asNode();
                                            String trangThai;
                                            if (node.get("trangThai").asInt() == 1) {
                                                trangThai = "Đang Kinh Doanh";
                                            } else {
                                                trangThai = "Ngừng Kinh Doanh";
                                            }
                                            return new Food(node.get("foodID").asString(),
                                                    node.get("foodName").asString(),
                                                    node.get("price").asDouble(),
                                                    node.get("img").asString(),
                                                    node.get("soLuong").asInt(),
                                                    trangThai);
                                        }).toList();
                    });
        }
    }

    public Food findFoodByID(String id) {
        String query = "MATCH (f:Food) where f.foodID= $ma RETURN f";

        Map<String, Object> params = Map.of("ma", id);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("f").asNode();
                        String trangThai;
                        if (node.get("trangThai").asInt() == 1) {
                            trangThai = "Đang Kinh Doanh";
                        } else {
                            trangThai = "Ngừng Kinh Doanh";
                        }

                        return new Food(node.get("foodID").asString(),
                                node.get("foodName").asString(),
                                node.get("price").asDouble(),
                                node.get("img").asString(),
                                node.get("soLuong").asInt(),
                                trangThai);

                    });
        }
    }

    public void deleteFood(String foodId) {
        String query = "MATCH (f:Food {foodID : $ma}) DETACH delete f";
        Map<String, Object> params = Map.of("ma", foodId);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }

    //===================================================================================================\\
    public void updateFoodSoLuong(int soLuong, String tenFood) {
        String query = "MATCH (f:Food {foodName : $ma}) SET f.soLuong = $sl";
        Map<String, Object> params = Map.of("ma", tenFood, "sl", soLuong);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }
    //===================================================================================================\\
                                                   // THỐNG KÊ //
    public int soSanPham() {
        String query = "MATCH (p:Food) RETURN COUNT(p) AS totalProducts";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result.single().get("totalProducts").asInt();
                    }
            );
        }
    }

    public int soDanhMuc() {
        String query = "MATCH (p:Category) RETURN COUNT(p) AS totalCategorys";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result.single().get("totalCategorys").asInt();
                    }
            );
        }
    }

    public int soHoaDonNgayHomNay(String ngay) {
        String query = "MATCH (o:Order)-[:CONTAINS]->(od:OrderDetail)\n"
                + "WHERE date(o.ngayTao) = date($n) AND o.trangThai = 4\n"
                + "RETURN COUNT(DISTINCT o) AS totalOrder";
         Map<String, Object> params = Map.of("n", ngay);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query,params);
                        return result.single().get("totalOrder").asInt();
                    }
            );
        }
    }
    
    public List<Food> findFoodSapHet(){
        String query = "MATCH (n:Food) WHERE n.soLuong < 10 RETURN n LIMIT 10";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("n").asNode();
                                            String trangThai;
                                            if (node.get("trangThai").asInt() == 1) {
                                                trangThai = "Đang Kinh Doanh";
                                            } else {
                                                trangThai = "Ngừng Kinh Doanh";
                                            }
                                            return new Food(node.get("foodID").asString(),
                                                    node.get("foodName").asString(),
                                                    node.get("price").asDouble(),
                                                    node.get("img").asString(),
                                                    node.get("soLuong").asInt(),
                                                    trangThai);
                                        }).toList();
                    });
        }
    }

    //===================================================================================================\\
    public List<Food> searchFoodByName(String foodName) {
        String query = "CALL db.index.fulltext.queryNodes('text_index_food', $name) YIELD node RETURN node";

        Map<String, Object> params = Map.of("name", "*" + foodName + "*");
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("node").asNode();
                                    String trangThai = " ";
                                    if (node.get("trangThai").asInt() == 1) {
                                        trangThai = "Còn";
                                    } else if (node.get("trangThai").asInt() == 2) {
                                        trangThai = "Hết";
                                    } else {
                                        trangThai = "Ngừng kinh doanh";
                                    }
                                    return new Food(node.get("foodID").asString(),
                                            node.get("foodName").asString(),
                                            node.get("price").asDouble(),
                                            node.get("img").asString(),
                                            node.get("soLuong").asInt(),
                                            trangThai);
                                }).toList();
                    });
        }
    }
    //===================================================================================================\\

    public Food searchFoodByName2(String foodName) {
        String query = "MATCH (n:Food) where n.foodName= $name RETURN n";

        Map<String, Object> params = Map.of("name", foodName);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("n").asNode();
                        String trangThai = " ";
                        if (node.get("trangThai").asInt() == 1) {
                            trangThai = "Còn";
                        } else if (node.get("trangThai").asInt() == 2) {
                            trangThai = "Hết";
                        } else {
                            trangThai = "Ngừng kinh doanh";
                        }
                        return new Food(node.get("foodID").asString(),
                                node.get("foodName").asString(),
                                node.get("price").asDouble(),
                                node.get("img").asString(),
                                node.get("soLuong").asInt(),
                                trangThai);

                    });
        }
    }

    // Tìm sp theo trang thai
    public List<Food> findFoodTrangThai(int tt) {
        String query = "MATCH (f:Food {trangThai:$tt}) return f";
        Map<String, Object> params = Map.of("tt", tt);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("f").asNode();
                                    String trangThai;
                                    if (node.get("trangThai").asInt() == 1) {
                                        trangThai = "Đang Kinh Doanh";
                                    } else {
                                        trangThai = "Ngừng Kinh Doanh";
                                    }

                                    return new Food(node.get("foodID").asString(),
                                            node.get("foodName").asString(),
                                            node.get("price").asDouble(),
                                            node.get("img").asString(),
                                            node.get("soLuong").asInt(),
                                            trangThai);

                                }).toList();
                    });
        }
    }

    public List<Food> findFoodCon() {
        String query = "MATCH (f:Food) where f.soLuong > 0 return f";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result.stream()
                                .map(record -> {
                                    Node node = record.get("f").asNode();
                                    String trangThai;
                                    if (node.get("trangThai").asInt() == 1) {
                                        trangThai = "Đang Kinh Doanh";
                                    } else {
                                        trangThai = "Ngừng Kinh Doanh";
                                    }
                                    return new Food(node.get("foodID").asString(),
                                            node.get("foodName").asString(),
                                            node.get("price").asDouble(),
                                            node.get("img").asString(),
                                            node.get("soLuong").asInt(),
                                            trangThai);
                                }).toList();
                    });
        }
    }

    public List<Food> findFoodHet() {
        String query = "MATCH (f:Food) where f.soLuong = 0 return f";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result.stream()
                                .map(record -> {
                                    Node node = result.single().get("f").asNode();
                                    String trangThai;
                                    if (node.get("trangThai").asInt() == 1) {
                                        trangThai = "Đang Kinh Doanh";
                                    } else {
                                        trangThai = "Ngừng Kinh Doanh";
                                    }
                                    return new Food(node.get("foodID").asString(),
                                            node.get("foodName").asString(),
                                            node.get("price").asDouble(),
                                            node.get("img").asString(),
                                            node.get("soLuong").asInt(),
                                            trangThai);
                                }).toList();
                    });
        }
    }

    public String lay2SoCuoiMa(String loai) {
        String query = "MATCH (f:Food)\n"
                + "WHERE f.foodID STARTS WITH $ma1\n"
                + "WITH f, replace(f.foodID, $ma2, '') AS SoCuoi \n"
                + "RETURN SoCuoi\n"
                + "ORDER BY SoCuoi DESC\n"
                + "LIMIT 1";
        Map<String, Object> params = Map.of("ma1", loai, "ma2", loai);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query, params);
                if (result.hasNext()) {
                    return result.single().get("SoCuoi").asString();
                } else {
                    return "00";
                }

            });
        }
    }

    //===================================================================================================\\
    //đóng kết nối;
    public void close() {
        driver.close();
    }
}
