/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.EnumTrangThai;
import entity.Table;
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
public class TableDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    //Mở kết nối đến database
    public TableDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = SessionConfig.builder().withDefaultAccessMode(AccessMode.WRITE).withDatabase(dbName).build();
    }

    //===================================================================================================\\
    /**
     * Load toàn bộ danh sách bàn
     */
    public List<Table> getAllTable() {
        String query = "MATCH (t:Table) RETURN t";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("t").asNode();
                                            String trangThai = node.get("trangThai").asString();
                                            if (trangThai.equalsIgnoreCase("Trống")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.TRONG, node.get("soGhe").asInt());
                                            } else if (trangThai.equalsIgnoreCase("Chờ")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.CHO, node.get("soGhe").asInt());
                                            } else {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.DANGSU_DUNG, node.get("soGhe").asInt());
                                            }

                                        }).toList();
                    });
        }
    }
    //===================================================================================================\\

    /**
     * get danh sách bàn theo tiêu chí là 2,4,8,12
     */
    public List<Table> getTableBySoGhe(int soGhe) {
        String query = "MATCH (t:Table) WHERE t.soGhe=$soghe return t";
        Map<String, Object> params = Map.of("soghe", soGhe);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("t").asNode();
                                            String trangThai = node.get("trangThai").asString();
                                            if (trangThai.equalsIgnoreCase("Trống")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.TRONG, soGhe);
                                            } else if (trangThai.equalsIgnoreCase("Chờ")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.CHO, soGhe);
                                            } else {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.DANGSU_DUNG, soGhe);
                                            }

                                        }).toList();
                    });
        }
    }
    //===================================================================================================\\

    public int loadNumberByState(String state) {
        String query = "MATCH (t:Table) WHERE t.trangThai = $tt RETURN COUNT(t) AS count";
        Map<String, Object> params = Map.of("tt", state);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result.single().get("count").asInt();
                    });
        }
    }
    //===================================================================================================\\

    public void updateTrangThaiTable(String trangThai, String ma) {
        String query = "MATCH (t:Table {soBan: $so})\n"
                + "SET t.trangThai = $tt";
        Map<String, Object> params = Map.of("so", ma, "tt", trangThai);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });

        }
    }

    //===================================================================================================\\
    public List<Table> getTableByTrangThai(String state) {
        String query = "MATCH (t:Table) WHERE t.trangThai= $tt return t";
        Map<String, Object> params = Map.of("tt", state);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        return result
                                .stream()
                                .map(
                                        record -> {
                                            Node node = record.get("t").asNode();
                                            String trangThai = node.get("trangThai").asString();
                                            if (trangThai.equalsIgnoreCase("Trống")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.TRONG, node.get("soGhe").asInt());
                                            } else if (trangThai.equalsIgnoreCase("Chờ")) {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.CHO, node.get("soGhe").asInt());
                                            } else {
                                                return new Table(node.get("soBan").asString(), EnumTrangThai.DANGSU_DUNG, node.get("soGhe").asInt());
                                            }

                                        }).toList();
                    });
        }
    }

    //===================================================================================================\\
    public Table timBanTheoSoBan(String maBan) {
        String query = "MATCH (t:Table) WHERE t.soBan=$sb return t";
        Map<String, Object> params = Map.of("sb", maBan);
        try (Session session = driver.session(sessionConfig);) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("t").asNode();
                        String trangThai = node.get("trangThai").asString();
                        if (trangThai.equalsIgnoreCase("Trống")) {
                            return new Table(node.get("soBan").asString(), EnumTrangThai.TRONG, node.get("soGhe").asInt());
                        } else if (trangThai.equalsIgnoreCase("Chờ")) {
                            return new Table(node.get("soBan").asString(), EnumTrangThai.CHO, node.get("soGhe").asInt());
                        } else {
                            return new Table(node.get("soBan").asString(), EnumTrangThai.DANGSU_DUNG, node.get("soGhe").asInt());
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
