package table_model;

import controller.InvoiceController;
import model.Invoice;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import interfaces.TableModel;

public class InvoiceTableModel extends AbstractTableModel implements TableModel{
    private List<Invoice> ivoicesList;
    private InvoiceController controller;
    private String[] header = {"Id", "Corporate Name", "CNPJ", "Email", "Nº of Products"};

    public InvoiceTableModel() {
        this.controller = new InvoiceController();
        
        loadObjects();
       
    }

    @Override
    public int getRowCount() {
        return this.ivoicesList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(this.ivoicesList.isEmpty() || rowIndex >= ivoicesList.size()) return null;
        
        Invoice ivoiceTemp = this.ivoicesList.get(rowIndex);
        if(ivoiceTemp == null) return null;
        switch (columnIndex){
            case 0: return ivoiceTemp.getId();
           
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    
    //methods from interface TableModel
    @Override
    public void loadObjects(){
        this.ivoicesList = this.controller.getAllInvoices();
    }
    
    @Override
    public void setResults(List results){
        this.ivoicesList = results;
    }
    
    @Override
    public void addObject(Object ivoice){
        this.ivoicesList.add((Invoice) ivoice);
    }

    @Override
    public Invoice getObjectAtRowIndex(int rowIndex){
        if(rowIndex < ivoicesList.size()){
            return this.ivoicesList.get(rowIndex);
        }
        return null;
    }

    @Override
    public void removeObjectAtRowIndex(int rowIndex){
        this.ivoicesList.remove(rowIndex);
    }


    
    
}
