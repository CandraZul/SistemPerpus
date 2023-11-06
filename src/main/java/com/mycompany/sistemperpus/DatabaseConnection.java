/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemperpus;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author candr
 */
public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/library_system";
    private static final String username = "root";
    private static final String password = "";
    private static java.sql.Connection connection = null;
    
    private DatabaseConnection(){
    }
    
    public static java.sql.Connection getConnection(){
        if (connection==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Koneksi Sukses");
            } catch (ClassNotFoundException | SQLException e){
                System.out.println("Pesan error: " + e);
            } 
        }
        return connection;
    }
}
