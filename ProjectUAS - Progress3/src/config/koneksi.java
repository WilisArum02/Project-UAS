/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    private static Connection connection;
    
    public static Connection getConnection(){
            try {
                String url = "jdbc:postgresql://localhost:5432/SIBoox";
                String user = "postgres";
                String pass = "123";
                DriverManager.registerDriver(new org.postgresql.Driver());
                connection = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
               Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        return connection;
}
}
