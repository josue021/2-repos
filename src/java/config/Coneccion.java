
package config;

import java.sql.*;

public class Coneccion {
    
    Connection con; 
    
    public Coneccion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/agenda","root","josuem0217");
            
            
        } catch (Exception e) {
            System.err.print("Error"+e);
        }
        }
        
        public Connection  getConnecion (){
            return con;  
    }
    
}
