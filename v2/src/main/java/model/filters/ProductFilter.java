package model.filters;

import java.util.ArrayList;

public class ProductFilter{
    private Integer costPriceMin; 
    private Integer costPriceMax; 
    private Integer sellingPriceMin;       
    private Integer sellingPriceMax; 
    private Integer profitMin; 
    private Integer profitMax; 
    private Integer supplierId;
    
    private String name; 
    private String category; 
    private String subCategory; 
    private String size; 
    
    private Boolean availableInStock; 
    
    
    private ArrayList<String> arrayString; 
    private ArrayList<Integer> arrayInteger; 

    public ProductFilter() {
        arrayString = new ArrayList<>();
        arrayInteger = new ArrayList<>(); 
        
        arrayInteger.add(costPriceMin); 
        arrayInteger.add(costPriceMax); 
        arrayInteger.add(sellingPriceMin);       
        arrayInteger.add(sellingPriceMax); 
        arrayInteger.add(profitMin); 
        arrayInteger.add(profitMax); 
        arrayInteger.add(supplierId);
        
        arrayString.add(name); 
        arrayString.add(category); 
        arrayString.add(subCategory); 
        arrayString.add(size); 
        
        
        for(Integer i: arrayInteger){
            i = 0;
        }
        
        for(String s: arrayString){
            s = "";
        }
    }

    public Integer getCostPriceMin() {
        return costPriceMin;
    }

    public void setCostPriceMin(Integer costPriceMin) {
        this.costPriceMin = costPriceMin;
    }

    public Integer getCostPriceMax() {
        return costPriceMax;
    }

    public void setCostPriceMax(Integer costPriceMax) {
        this.costPriceMax = costPriceMax;
    }

    public Integer getSellingPriceMin() {
        return sellingPriceMin;
    }

    public void setSellingPriceMin(Integer sellingPriceMin) {
        this.sellingPriceMin = sellingPriceMin;
    }

    public Integer getSellingPriceMax() {
        return sellingPriceMax;
    }

    public void setSellingPriceMax(Integer sellingPriceMax) {
        this.sellingPriceMax = sellingPriceMax;
    }

    public Integer getProfitMin() {
        return profitMin;
    }

    public void setProfitMin(Integer profitMin) {
        this.profitMin = profitMin;
    }

    public Integer getProfitMax() {
        return profitMax;
    }

    public void setProfitMax(Integer profitMax) {
        this.profitMax = profitMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(Boolean availableInStock) {
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

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public ArrayList<String> getArray() {
        return arrayString;
    }

    public void setArray(ArrayList<String> array) {
        this.arrayString = array;
    }
    
    

    
    
    
    

    
    
}
