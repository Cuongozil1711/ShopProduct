package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
        
//	public static Connection getConnecttion() {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//            } catch (SQLException e) {
//            // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            return con;
//	}
        public static Connection getConnecttion(){
            String jdbcURL = "jdbc:mysql://localhost:3306/pttk";
            String jdbcUsername = "root";
            String jdbcPassword = "213006diepdo";
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            } catch (SQLException e) {
            // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }
	
	public static void main(String[] args) {
//		System.out.println(getConnecttion());
	}

}
