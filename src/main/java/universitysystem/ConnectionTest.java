package universitysystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT current_database(), inet_server_port()");
        rs.next();
        System.out.println("Database: " + rs.getString(1));
        System.out.println("Port: " + rs.getInt(2));

        rs = st.executeQuery("SELECT COUNT(*) FROM students");
        rs.next();
        System.out.println("Students in table: " + rs.getInt(1));

        con.close();
    }
}