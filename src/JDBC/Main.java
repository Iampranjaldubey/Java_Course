package JDBC;

import java.sql.*;

public class Main {
    public static final String url = "jdbc:mysql://localhost:3306/college";
    public static final String user = "root";
    public static final String pass = "@pranjal";


    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

