/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrintRecept;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Nikita
 */
public class JTabRcpt extends AbstractTableModel {
    ArrayList<DataRcpt> list;
    
    public  JTabRcpt(ArrayList<DataRcpt> list){
        super();
        this.list = list;   
    }
    
      @Override
    public int getRowCount() {
        return list.size();
    }
    @Override
    public int getColumnCount() {
        return 5;
    }
    
     @Override
    public String getColumnName(int c) {
        switch (c) {
            case 0:
                return "Название пива ";
            case 1:
                return "Рецепт";
            case 2:
                return "Автор";
            case 3:
                return "Ингредиенты";
            default:
                return "Время приготовления";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {   
            case 0:
                return list.get(rowIndex).putName();
            case 1:
                return list.get(rowIndex).putRecept();
            case 2:
                return list.get(rowIndex).putAuthor();
            case 3:
                return list.get(rowIndex).putIngr();
            default:
                return list.get(rowIndex).putTime();
        } 
        
    }
}
