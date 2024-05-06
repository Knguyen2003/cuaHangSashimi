/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.AppUltil;

/**
 *
 * @author ACER
 */
public class OrderDaoTest {

    private OrderDao orderDao;
    private static final String DB_NAME = "quanliquanan";

    @BeforeEach
    //@BeforeEach dùng để chạy trước mỗi phương thức kiểm thử
    void setup() {
        orderDao = new OrderDao(AppUltil.initDriver(), DB_NAME);
    }

    
//    @Test
//    void testLayBaSoCuoiCuaMaHoaDonTheoNgay(){
//        String ma =orderDao.layBaSoCuoiCuaMaHoaDonTheoNgay("01122003");
//        System.out.println(ma);
//    }
//    
    
    
    
    
    
    
    
    
    @AfterEach
    //@AfterEach dùng để chạy sau mỗi phương thức kiểm thử
    void tearDown() {
        orderDao.close();
        orderDao = null;
    }
}
