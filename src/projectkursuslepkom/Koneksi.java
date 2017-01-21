/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkursuslepkom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Risnawan
 */
public class Koneksi {
    private Statement data = null;
    private Connection koneksi = null;
    
    private String Url = "jdbc:mysql://localhost:3306/ragunan";
    private String DBUser = "root";
    private String DBPass = "";

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
}