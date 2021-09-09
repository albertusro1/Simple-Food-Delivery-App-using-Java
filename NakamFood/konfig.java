/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NakamFood;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konfig {

    private static Connection SQLServerConfig;

    public static Connection configDB() throws SQLException {
        try {
    String url = "jdbc:sqlserver://localhost:1433;databaseName=nakam_food;integratedSecurity=true";
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            SQLServerConfig = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal " + e.getMessage());
        }
        return SQLServerConfig;
    }
}