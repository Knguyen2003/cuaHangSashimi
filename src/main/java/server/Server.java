package server;

import dao.AccountDao;
import dao.CategoryDao;
import dao.CustomerDao;
import dao.EmployeeDao;
import dao.FoodDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import dao.TableDao;
import java.rmi.registry.LocateRegistry;
import javax.naming.Context;
import javax.naming.InitialContext;
import util.AppUltil;

public class Server {

    private static final String URL = "rmi://DESKTOP-GOSNO9K:8021/";

    public static void main(String[] args) {
        try {

            Context context = new InitialContext();

            AccountDao accountDao = new AccountDao(AppUltil.initDriver(), "quanliquanan");
            CategoryDao categoryDao = new CategoryDao(AppUltil.initDriver(), "quanliquanan");
            CustomerDao customerDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
            EmployeeDao employeeDao = new EmployeeDao(AppUltil.initDriver(), "quanliquanan");
            FoodDao foodDao = new FoodDao(AppUltil.initDriver(), "quanliquanan");
            OrderDao orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
            OrderDetailDao orderDetailDao = new OrderDetailDao(AppUltil.initDriver(), "quanliquanan");
            TableDao tableDao = new TableDao(AppUltil.initDriver(), "quanliquanan");

            LocateRegistry.createRegistry(8021);

            context.bind(URL + "accountDao", accountDao);
            context.bind(URL + "categoryDao", categoryDao);
            context.bind(URL + "customerDao", customerDao);
            context.bind(URL + "employeeDao", employeeDao);
            context.bind(URL + "foodDao", foodDao);
            context.bind(URL + "orderDao", orderDao);
            context.bind(URL + "orderDetailDao", orderDetailDao);
            context.bind(URL + "tableDao", tableDao);
            
            

            System.out.println("Server is running...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
