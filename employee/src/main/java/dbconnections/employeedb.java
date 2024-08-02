package dbconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class employeedb {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/employeedb";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = "root"; 

    private static Connection conn = null;

    private employeedb() {
        // Private constructor to prevent object creation from outside
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Failed to load JDBC driver", e);
            }
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }
}
