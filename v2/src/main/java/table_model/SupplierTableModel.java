package table_model;

import controller.SupplierController;
import model.Supplier;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SupplierTableModel extends AbstractTableModel {
    private List<Supplier> suppliersList;

    SupplierController controller;
    private String[] header = {"Id", "Corporate Name", "CNPJ", "Email"};

    public SupplierTableModel() {
        this.controller = new SupplierController();
        loadSuppliers();
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
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    public void loadSuppliers(){
        this.suppliersList = this.controller.getAllSuppliers();
    }

    public void addSupplier(Supplier supplier){
        this.suppliersList.add(supplier);
    }
}
