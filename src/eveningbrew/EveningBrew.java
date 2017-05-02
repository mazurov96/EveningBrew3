
package eveningbrew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Nikita
 */
public class EveningBrew {
/*
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
   
*/
  public static void main(String args[]) {
      startFrame frame=  new startFrame();
      frame.setVisible(true);
     /*   String query = "select Color from beer_main";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
               
            rs= stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println("Name Beer : " + name);
           }
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) {  }
            try { stmt.close(); } catch(SQLException se) {  }
            try { rs.close(); } catch(SQLException se) {  }
        }
        
    
*/
    }

    
}