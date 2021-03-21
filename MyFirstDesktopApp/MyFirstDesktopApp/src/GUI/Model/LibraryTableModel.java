/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author Admin
 */
import BLL.Library;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class LibraryTableModel extends AbstractTableModel {
    
    List <Library> list;
    String [] cols = {"Nr." , "Emertimi"};
    
    public LibraryTableModel (){}
    
    public LibraryTableModel (List<Library> list){
        this.list = list;
    }
    
    public void addList(List<Library> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    public void remove(int row){
        list.remove(row);
    }
    
    public Library getLibrary(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Library l = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return l.getLibraryID();
            case 1:
                return l.getDescription();
            default:
                return null;
        }
    }
}