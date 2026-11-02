package universitysystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5433/University";
        String user = "postgres";
        String password = "codePHP12";
        return DriverManager.getConnection(url, user, password);
    }
}