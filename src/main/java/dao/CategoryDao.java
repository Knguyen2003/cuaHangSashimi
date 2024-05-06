/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import java.util.ArrayList;
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
public class CategoryDao {

    private Driver driver;
    private SessionConfig sessionConfig;

    public CategoryDao(Driver driver, String dbName) {
        this.driver = driver;
        sessionConfig = sessionConfig.builder()
                .withDatabase(dbName)
                .withDefaultAccessMode(AccessMode.WRITE)
                .build();
    }

    public List<Category> getAllCategory() {
        String query = "MATCH (n:Category) RETURN n";
        try (Session session = driver.session(sessionConfig)) {
            return session.executeRead(tx -> {
                Result result = tx.run(query);
                if (!result.hasNext()) {
                    return new ArrayList<>();
                }
                return result.stream().map(record -> {
                    Node node = record.get("n").asNode();
                    return new Category(node.get("categoryID").asString(),
                            node.get("categoryName").asString());

                }).toList();
            });
        }
    }
    
    
    public String getIdByCategoryName(String name){
        String query = "MATCH (n:Category {categoryName:$name1}) RETURN n.categoryID";
        Map<String, Object> params = Map.of("name1", name);
		try (Session session = driver.session(sessionConfig)) {
			return session.executeWrite(tx -> {
				Result result = tx.run(query,params);
				return result.single().get("n.categoryID").asString();
			});
		}
    }
    
//    MATCH (f:Food {foodID:'MC01'})-[r:BELONG_TO]->(c:Category) RETURN c.categoryName
    public String findCategoryNameByFoodID(String foodId){
        String query = "MATCH (f:Food {foodID:$foodID})-[r:BELONG_TO]->(c:Category) RETURN c.categoryName";
        Map<String, Object> params = Map.of("foodID", foodId);
		try (Session session = driver.session(sessionConfig)) {
			return session.executeWrite(tx -> {
				Result result = tx.run(query,params);
				return result.single().get("c.categoryName").asString();
			});
		}
    }
}
