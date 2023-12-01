package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud?characterEncoding=UTF-8", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexion " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
