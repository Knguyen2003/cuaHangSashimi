/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.junit.jupiter.api.BeforeEach;
import util.AppUltil;

/**
 *
 * @author ACER
 */
public class OrderDetailDaoTest {
     private OrderDetailDao orderDao;
    private static final String DB_NAME = "quanliquanan";

    @BeforeEach
    //@BeforeEach dùng để chạy trước mỗi phương thức kiểm thử
    void setup() {
        orderDao = new OrderDetailDao(AppUltil.initDriver(), DB_NAME);
    }
    
    
   
}
