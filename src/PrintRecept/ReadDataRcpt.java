/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintRecept;



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
public class ReadDataRcpt {
    
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public  static ArrayList<DataRcpt> list;
    
    public ReadDataRcpt(){
        
    }
    public ArrayList<DataRcpt> ReadData(){
        String query = "select * from beer_recipe";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
               
            rs = stmt.executeQuery(query);
            
            list = new ArrayList<>();
           
            while (rs.next()) {
                DataRcpt ft=new DataRcpt();
                 ft.getName(rs.getString(1));
                 ft.getRecept(rs.getString(2));
                 ft.getAuthor(rs.getString(3));
                 ft.getIngr(rs.getString(4));
                 ft.getTime(rs.getString(5));
                 list.add(ft);
                
                //System.out.println("Name Beer : " + carid);
           }
            
           
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) {  }
            try { stmt.close(); } catch(SQLException se) {  }
            try { rs.close(); } catch(SQLException se) {  }
            return list;
        }
    }
}
