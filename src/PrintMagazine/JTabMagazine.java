/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintMagazine;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Nikita
 */
public  class JTabMagazine extends AbstractTableModel {
    ArrayList<DataBD> list;
    
    public  JTabMagazine(ArrayList<DataBD> list){
        super();
        this.list = list;   
    }
    
      @Override
    public int getRowCount() {
        return list.size();
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    
     @Override
    public String getColumnName(int c) {
        switch (c) {
            case 0:
                return "Название";
            case 1:
                return "Адрес";
            case 2:
                return "Тип";
            default:
                return "Работает до";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {   
            case 0:
                return list.get(rowIndex).putName();
            case 1:
                return list.get(rowIndex).putAddress();
            case 2:
                return list.get(rowIndex).putType();
            default:
                return list.get(rowIndex).putWorkTime();
        } 
        
    }
    
    
    
}
