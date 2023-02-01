package table_model;

import controller.ProductController;
import interfaces.TableModel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Product;

public class ProductTableModel extends AbstractTableModel implements TableModel{
    private List<Product> productsList;
    private ProductController controller;
    private String[] header = {"ID", "NAME", "AVAILABLE", "COST PRICE", "SELLING PRICE", 
        "PROFIT", "CATEGORY", "SUBCATEGORY", "SIZE", "SUPPLIER"};

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
        Product productTemp = this.productsList.get(rowIndex);
        switch (columnIndex){
            case 0: return productTemp.getId();
            case 1: return productTemp.getName();
            case 2: return productTemp.isAvailableInStock();
            case 3: return productTemp.getCostPrice();
            case 4: return productTemp.getSellingPrice();
            case 5: return productTemp.getProfit();
            case 6: return productTemp.getCategory();
            case 7: return productTemp.getSubCategory();
            case 8: return productTemp.getSize();
            case 9: return productTemp.getSupplier().getCnpj() + "         -         " + productTemp.getSupplier().getCorporateName();
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
