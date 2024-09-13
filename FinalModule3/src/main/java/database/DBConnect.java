package database;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DBConnect {
    private static String dbURL = "jdbc:mysql://localhost:3306/finalmodule3";
    private static String dbUser = "root";

    private static String dbPassword = "12345678";




    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("-----------------Kết nối thành công-----------------");
        } catch (SQLException e) {
            System.out.println("-----------------Lỗi kết nối-----------------");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("-----------------Lỗi kết nối abc-----------------");
            e.printStackTrace();
        }
        return connection;
    }
}




