/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintFavorite;



import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


  
  
public class JTabFav extends AbstractTableModel{  
    ArrayList<DataFav> listFav;
    
    public  JTabFav(ArrayList<DataFav> list){
        super();
        this.listFav = list; 
        
    }
    public void update(){
         fireTableDataChanged();
     }
    
      @Override
    public int getRowCount() {
        return listFav.size();
    }
    @Override
    public int getColumnCount() {
        return 7;
    }
    
     @Override
    public String getColumnName(int c) {
        switch (c) {
            case 0:
                return "Название";
            case 1:
                return "Крепость";
            case 2:
                return "Цвет";
            case 3:
                return "Упаковка";
            case 4:
                return "Особенности";
            case 5:
                return "Производитель";
            default:
                return "Цена/0.5";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {   
            case 0:
                return listFav.get(rowIndex).putName();
            case 1:
                return listFav.get(rowIndex).putFortress();
            case 2:
                return listFav.get(rowIndex).putColor();
            case 3:
                return listFav.get(rowIndex).putVessel();
            case 4:
                return listFav.get(rowIndex).putSpecification();
            case 5:
                return listFav.get(rowIndex).putAddress();
            default:
                return listFav.get(rowIndex).putPrice();
        } 
     
    }
    
    
 
}
