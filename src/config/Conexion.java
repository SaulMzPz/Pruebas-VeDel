package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedel_db","root","Tun0mbr3.");
        }catch (Exception e){
            System.err.println("error" +e);
        }
            
    }
    
    public Connection getConnection(){
    return con;
    }
    
}
