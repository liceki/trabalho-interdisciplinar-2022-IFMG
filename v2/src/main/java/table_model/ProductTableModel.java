package table_model;

import controller.ProductController;
import interfaces.TableModel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Product;

public class ProductTableModel extends AbstractTableModel implements TableModel{
 private List<Product> productsList;
    private ProductController controller;
    private String[] header = {"ID", "", ""};

    public ProductTableModel() {
        this.controller = new ProductController();
        
        loadObjects();
       
    }

    @Override
    public int getRowCount() {
        return this.productsList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product productsTemp = this.productsList.get(rowIndex);
        switch (columnIndex){
            case 0: return productsTemp.getId();

            
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
        this.productsList = this.controller.getAllProducts();
    }
    
    @Override
    public void setResults(List results){
        this.productsList = results;
    }
    
    @Override
    public void addObject(Object product){
        this.productsList.add((Product) product);
    }

    @Override
    public Product getObjectAtRowIndex(int rowIndex){
        return this.productsList.get(rowIndex);
    }

    @Override
    public void removeObjectAtRowIndex(int rowIndex){
        this.productsList.remove(rowIndex);
    }
}
