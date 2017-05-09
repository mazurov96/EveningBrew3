/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintDB;

import WorkWithBD.InformationBeer;
import java.awt.BorderLayout;  
import java.awt.EventQueue;  
  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.border.EmptyBorder;  
import javax.swing.table.DefaultTableModel;  
import javax.swing.JScrollPane;  
import javax.swing.JButton;  
import javax.swing.JTable;  
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
  
  
public class JTabBM extends JFrame {  
  
 private JPanel contentPane;  
 private JTable table;  
 private DefaultTableModel model; 
 
    private static final String url = "jdbc:mysql://localhost:3306/new_schema";
    private static final String user = "BrewUser";
    private static final String password = "12345678";
    
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public static ArrayList<TBM> list;
    
  static JTabBM stframe = new JTabBM();
    
    public static void openframe(){
        stframe.setVisible(true);
    }
    
    public static void closeframe(){
        stframe.setVisible(false);
    }
   
    
     
      
  
 public static void DB() {
        
        String query = "select * from beer_main";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
               
            rs= stmt.executeQuery(query);
            
             list = new ArrayList<>();
           
            while (rs.next()) {
                TBM ft=new TBM();
                 ft.getName(rs.getString(2));
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
        }
        
    

    }
   
 public  JTabBM() { 
    
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  setBounds(350, 200, 450, 300);  
  contentPane = new JPanel();  
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));  
  contentPane.setLayout(new BorderLayout(0, 0));  
  setContentPane(contentPane);   
  
/* 
Создадим экземпляр класса DefaultTableModel и перегрузим 
в нем метод isCellEditable. Так как isCellEditable всегда 
возвращает true, то абсолютно все ячейки являются  
редактируемыми 
*/  
  model = new DefaultTableModel(){  
   @Override  
   public boolean isCellEditable(int row, int column){  
    return true;  
   };     
  };  
/* 
Добавим столбцы и заполним их шапку 
*/               
 model.addColumn("Название");
 model.addColumn("Крепость");   
 model.addColumn("Цвет");
 model.addColumn("Упаковка");
 model.addColumn("Местоположение");
 model.addColumn("Цена/0.5");
/* 
Если не использовать JScrollPane тогда не будут видны  
заголовки столбцов нашей таблицы 
*/  
  JScrollPane scrollPane = new JScrollPane();  
  contentPane.add(scrollPane, BorderLayout.CENTER);  
    
/* 
Создадим таблицу и передадим в качесве параметра, 
передадим нашу модель   
*/  
  table = new JTable(model);  
  scrollPane.setViewportView(table);  
    
  JPanel panel = new JPanel();  
  contentPane.add(panel, BorderLayout.SOUTH);  
    
  JButton btnNewButton = new JButton("Добавить"); 
  JButton ButtonBack = new JButton("Назад"); 
  btnNewButton.addMouseListener(new MouseAdapter() {  
   @Override  
   public void mouseClicked(MouseEvent arg0) { 
       model.setRowCount(0);
      for(int i=0;i<list.size();i++){
         TBM gt=list.get(i);
   String[] data= { gt.putName()};  
//Добавим строку data в таблицу   
   model.addRow(data); 
      }
         
   
   }  
  }); 
   ButtonBack.addMouseListener(new MouseAdapter() {  
   @Override  
   public void mouseClicked(MouseEvent arg0) { 
   JTabBM.closeframe();
   InformationBeer.openframe();
   }  
  });
  panel.add(btnNewButton);  
  panel.add(ButtonBack); 
 }  
  
}
