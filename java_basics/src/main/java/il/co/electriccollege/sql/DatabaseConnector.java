package il.co.electriccollege.sql;

import java.sql.*;

/**
 * Created by yaakov on 8/19/17.
 */
public class DatabaseConnector {
    private Connection conn = null;

    // JDBC driver name and database URL
    static final String DB_URL = "jdbc:mysql://localhost/test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public Connection getDbConnection() {

        try {
            // Open a connection
            System.out.println("Connecting to database");
            conn = DriverManager.getConnection(DB_URL, USER, null); // add password if necessary
            return conn;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
