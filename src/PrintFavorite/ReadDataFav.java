/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintFavorite;



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
public class ReadDataFav {
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private ArrayList<DataFav> listFav;
    
    public ArrayList<DataFav> ReadData(){
        String query = "select * from favorites";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
               
            rs = stmt.executeQuery(query);
            
            listFav = new ArrayList<>();
           
            while (rs.next()) {
                DataFav ft=new DataFav();
                 ft.getName(rs.getString(1));
                 ft.getFortress(rs.getString(2));
                 ft.getColor(rs.getString(3));
                 ft.getVessel(rs.getString(4));
                 ft.getSpecification(rs.getString(5));
                 ft.getAddress(rs.getString(6));
                 ft.getPrice(rs.getString(7));
                 listFav.add(ft);
                
                
           }
            
           
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) {  }
            try { stmt.close(); } catch(SQLException se) {  }
            try { rs.close(); } catch(SQLException se) {  }
            return listFav;
        }
    }
}
