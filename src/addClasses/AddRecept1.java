/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addClasses;

import PrintRecept.DataRcpt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nikita
 */
public class AddRecept1 {
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    public  static ArrayList<DataRcpt> list;
    
    public AddRecept1(){
        
    }
    
    public void add(String name, String pecept, 
                     String author, String ingr,  String time){
        
        String query = "insert into beer_recipe (Name_beer, Recepe, Author, Ingredients, time) values("
                +quotate(name)+","
                +quotate(pecept)+","
                +quotate(author)+","
                +quotate(ingr)+","
                +quotate(time)
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
