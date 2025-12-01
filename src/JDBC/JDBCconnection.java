package JDBC;
import java.sql.*;


public class JDBCconnection {
    // Database details
    public static final String DB_URL = "jdbc:mysql://localhost:3306/college";
    public static final String USER = "root";
    public static final String PASSWORD = "@pranjal";

    public void connect(String dbUrl, String user, String password) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Establish connection
            conn = DriverManager.getConnection(dbUrl, user, password);

            // 2. Create statement
            stmt = conn.createStatement();

            // 3. Execute query
            String query = "SELECT roll_no, name FROM students";
            rs = stmt.executeQuery(query);

            // 4. Process result
            while (rs.next()) {
                int id = rs.getInt("roll_no");
                String name = rs.getString("name");

                System.out.println("ID: " + id + "  Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 5. Close Resources
        finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        JDBCconnection obj = new JDBCconnection();
        obj.connect(DB_URL, USER, PASSWORD);
    }
}
