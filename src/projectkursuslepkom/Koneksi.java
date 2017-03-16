/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkursuslepkom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Risnawan
 */
public class Koneksi {
    private Statement data = null;
    private Connection koneksi = null;
    
    private String Url = "jdbc:mysql://sinmaskul.esy.es:3306/u199193359_rgnan";
    private String DBUser = "u199193359_root";
    private String DBPass = "lepkom@123";

    public Koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(Url, DBUser, DBPass);
            data = this.koneksi.createStatement();
        }
        catch(Throwable ex){
            System.out.println("Error : "+ex);
            System.exit(1);
        } 
    }
    
    public Connection getConnection(){
        return koneksi;
    }
    
    public Statement getStatement(){
        return data;
    }
    public static Connection konek () {
        try{
            String Url = "jdbc:mysql://localhost:3306/ragunan";
            String DBUser = "root";
            String DBPass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = DriverManager.getConnection(Url, DBUser, DBPass);
            return conn;
        }
        catch(SQLException ex){
            System.out.println("Error : "+ex);
            System.exit(1);
            return null;
        }     
    }
}