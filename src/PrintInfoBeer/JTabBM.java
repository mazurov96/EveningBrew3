/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintInfoBeer;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


  
  
public class JTabBM extends AbstractTableModel{  
    ArrayList<DataBM> listBM;
    
    public  JTabBM(ArrayList<DataBM> list){
        super();
        this.listBM = list; 
        
    }
    public void update(){
         fireTableDataChanged();
     }
    
      @Override
    public int getRowCount() {
        return listBM.size();
    }
    @Override
    public int getColumnCount() {
        return 6;
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
                return "Производитель";
            default:
                return "Цена/0.5";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {   
            case 0:
                return listBM.get(rowIndex).putName();
            case 1:
                return listBM.get(rowIndex).putFortress();
            case 2:
                return listBM.get(rowIndex).putColor();
            case 3:
                return listBM.get(rowIndex).putVessel();
            case 4:
                return listBM.get(rowIndex).putAddress();
            default:
                return listBM.get(rowIndex).putPrice();
        } 
     
    }
    
    
 
}
