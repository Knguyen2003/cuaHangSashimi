/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Food;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.AppUltil;

/**
 *
 * @author ACER
 */
public class FoodDaoTest {

    private FoodDao foodDao;
    private static final String DB_NAME = "quanliquanan";

    @BeforeEach
    //@BeforeEach dùng để chạy trước mỗi phương thức kiểm thử
    void setup() {
        foodDao = new FoodDao(AppUltil.initDriver(), DB_NAME);
    }

//    @Test
//    void testGetAllFood() {
//        List<Food> dsMonAn = foodDao.getAllFood();
//        // Kiểm tra nếu danh sách không null và không rỗng
//        if (dsMonAn != null && !dsMonAn.isEmpty()) {
//            dsMonAn.forEach(System.out::println);
//        } else {
//            System.out.println("Danh sách món ăn là null hoặc rỗng");
//        }
//    }
    
//    @Test
//    void testGetFoodByCategoryName(){
//        List<Food> dsMonAn = foodDao.getFoodByCategoryName("Nước Uống");
//        // Kiểm tra nếu danh sách không null và không rỗng
//        if (dsMonAn != null && !dsMonAn.isEmpty()) {
//            dsMonAn.forEach(System.out::println);
//        } else {
//            System.out.println("Danh sách món ăn là null hoặc rỗng");
//        }
//    }
    
//    @Test
//    void testSearchFoodByName2(){
//        Food f = foodDao.searchFoodByName2("");
//        System.out.println(f);
//
//    }
    
    
//      @Test
//      void testGetAllFoodLimit20(){
//          foodDao.getAllFoodLimit20().forEach(System.out::println);
//          
//      }
    

    @AfterEach
    //@AfterEach dùng để chạy sau mỗi phương thức kiểm thử
    void tearDown() {
        foodDao.close();
        foodDao = null;
    }
}
