package model.filters;

import java.math.BigDecimal;
import java.util.ArrayList;
import model.Supplier;

public class ProductFilter{
    private String costPriceMin; 
    private String costPriceMax; 
    private String sellingPriceMin;       
    private String sellingPriceMax; 
    private String profitMin; 
    private String profitMax; 
    private String name; 
    private String availableInStock; 
    private String category; 
    private String subCategory; 
    private String size; 
    private String supplierId;
    
    private ArrayList<String> array; 

    public ProductFilter() {
        array = new ArrayList<>();
        
        array.add(costPriceMin); 
        array.add(costPriceMax); 
        array.add(sellingPriceMin);       
        array.add(sellingPriceMax); 
        array.add(profitMin); 
        array.add(profitMax); 
        array.add(name); 
        array.add(availableInStock); 
        array.add(category); 
        array.add(subCategory); 
        array.add(size); 
        array.add(supplierId);
        
        for(String s: array){
            s = "";
        }
    }

    public String getCostPriceMin() {
        return costPriceMin;
    }

    public void setCostPriceMin(String costPriceMin) {
        this.costPriceMin = costPriceMin;
    }

    public String getCostPriceMax() {
        return costPriceMax;
    }

    public void setCostPriceMax(String costPriceMax) {
        this.costPriceMax = costPriceMax;
    }

    public String getSellingPriceMin() {
        return sellingPriceMin;
    }

    public void setSellingPriceMin(String sellingPriceMin) {
        this.sellingPriceMin = sellingPriceMin;
    }

    public String getSellingPriceMax() {
        return sellingPriceMax;
    }

    public void setSellingPriceMax(String sellingPriceMax) {
        this.sellingPriceMax = sellingPriceMax;
    }

    public String getProfitMin() {
        return profitMin;
    }

    public void setProfitMin(String profitMin) {
        this.profitMin = profitMin;
    }

    public String getProfitMax() {
        return profitMax;
    }

    public void setProfitMax(String profitMax) {
        this.profitMax = profitMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(String availableInStock) {
        this.availableInStock = availableInStock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public void setArray(ArrayList<String> array) {
        this.array = array;
    }
    
    

    
    
    
    

    
    
}
