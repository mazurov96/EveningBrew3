/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addClasses;

import PrintInfoBeer.DataBM;
import PrintInfoBeer.ReadDataBM;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nikita
 */
public class AddBeer {
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
   
    
    public AddBeer(){
        
    }
    
    public void add(String id, String name, String fortress, 
                     String color, String vessel,  
                     String spec, String address, String price){
        
        String query = "insert into beer_main (id, Name_beer, Fortress, Color, "
                + "Vessel, Specification, ManufAddress, Price) values("
                +quotate(id)+","
                +quotate(name)+","
                +quotate(fortress)+","
                +quotate(color)+","
                +quotate(vessel)+","
                +quotate(spec)+","
                +quotate(address)+","
                +quotate(price)
                +")";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
               
            int done=stmt.executeUpdate(query);
         
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) {  }
            try { stmt.close(); } catch(SQLException se) {  }
            
            
        }
        
    }
    
     public String quotate(String content){
    
        return "'"+content+"'";
    }
}
