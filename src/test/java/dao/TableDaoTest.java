/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Table;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.AppUltil;

/**
 *
 * @author ACER
 */
public class TableDaoTest {
     private TableDao tableDao;
     private static final String DB_NAME = "quanliquanan";
	
	
	
	@BeforeEach
	//@BeforeEach dùng để chạy trước mỗi phương thức kiểm thử
	void setup() {
		tableDao = new TableDao(AppUltil.initDriver(), DB_NAME);
	}
        
        
//        @Test
//        void testGetAllTable(){
//            List<Table> dsBan = tableDao.getAllTable();
//            dsBan.forEach(System.out::println);
//        }
        
   
	@AfterEach
	//@AfterEach dùng để chạy sau mỗi phương thức kiểm thử
	void tearDown() {
		tableDao.close();
		tableDao = null;
	}     
        
}
