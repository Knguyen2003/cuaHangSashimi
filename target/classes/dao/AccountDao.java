/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Account;
import entity.Employee;
import entity.Food;
import java.util.Map;
import org.neo4j.driver.AccessMode;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;
import org.neo4j.driver.types.Node;

public class AccountDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    public AccountDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = sessionConfig.builder()
                .withDatabase(dbName)
                .withDefaultAccessMode(AccessMode.WRITE)
                .build();
    }

    public void createAccout(Employee ee) {
        String query = "MATCH (e:Employee {maNV: $maE})\n"
                + "CREATE (c:Account {tenDN: $ten,MatKhau :'1111', TrangThai : 1 ,LoaiNhanVien : $loai }) -[:HAS_ACCOUNT]-> (e)";
         Map<String, Object> params = Map.of("maE", ee.getMaNhanVien(), "ten", ee.getMaNhanVien(),"loai",ee.getChucVu());
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }
    
    
    
    public Account timTaiKhoan(String ma) {
        String query = "MATCH (n:Account) where n.tenDN= $tendn RETURN n";

        Map<String, Object> params = Map.of("tendn", ma);
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(
                    tx -> {
                        Result result = tx.run(query, params);
                        if (result.hasNext() == false) {
                            return null;
                        }
                        Node node = result.single().get("n").asNode();
                        Employee e = new Employee();
                        e.setMaNhanVien(node.get("tenDN").asString());
                        return new Account(e, node.get("MatKhau").asString(), node.get("TrangThai").asInt(), node.get("LoaiNhanVien").asString());

                    });
        }
    }
    
    
    
    public void updateTrangThai(int tt, String tenDn) {
        String query = "MATCH (n:Account {tenDN : $ten}) SET n.TrangThai = $trangThai";
        Map<String, Object> params = Map.of("ten",tenDn, "trangThai", tt);
        try (Session session = driver.session(sessionConfig);) {
            session.executeWrite(
                    tx -> {
                        return tx.run(query, params).consume();

                    });
        }
    }
    
    
    
    
    
    
    
    
    
    
}
