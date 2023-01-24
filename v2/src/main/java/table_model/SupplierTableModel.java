package table_model;

import controller.SupplierController;
import model.Supplier;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import interfaces.TableModel;

public class SupplierTableModel extends AbstractTableModel implements TableModel{
    private List<Supplier> suppliersList;
    private SupplierController controller;
    private String[] header = {"Id", "Corporate Name", "CNPJ", "Email", "Nº of Products"};

    public SupplierTableModel() {
        this.controller = new SupplierController();
        
        loadObjects();
       
    }

    @Override
    public int getRowCount() {
        return this.suppliersList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Supplier supplierTemp = this.suppliersList.get(rowIndex);
        switch (columnIndex){
            case 0: return supplierTemp.getId();
            case 1: return supplierTemp.getCorporateName();
            case 2: return supplierTemp.getCnpj();
            case 3: return supplierTemp.getEmail();
            case 4: 
                if(supplierTemp.getSuppliedProducts() != null){
                    return supplierTemp.getSuppliedProducts().size();
                } else {
                    return 0;
                }
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
        this.suppliersList = this.controller.getAllSuppliers();
    }
    
    @Override
    public void setResults(List results){
        this.suppliersList = results;
    }
    
    @Override
    public void addObject(Object supplier){
        this.suppliersList.add((Supplier) supplier);
    }

    @Override
    public Supplier getObjectAtRowIndex(int rowIndex){
        return this.suppliersList.get(rowIndex);
    }

    @Override
    public void removeObjectAtRowIndex(int rowIndex){
        this.suppliersList.remove(rowIndex);
    }


    
    
}
