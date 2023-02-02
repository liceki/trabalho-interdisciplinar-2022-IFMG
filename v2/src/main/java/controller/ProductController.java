package controller;

import interfaces.Controller;
import java.math.BigDecimal;
import java.util.List;
import model.Product;
import model.Supplier;
import model.filters.ProductFilter;
import repository.ProductRepository;

public class ProductController implements Controller {
    private ProductRepository repository;

    public ProductController() {
        repository = new ProductRepository();
    }

    public Product saveProduct(String name, String sellingPriceString, String costPriceString, 
            boolean inStock, String category, String subCategory, String size,Supplier supplier){
        
        BigDecimal sellingPrice = BigDecimal.valueOf(Double.parseDouble(sellingPriceString));
        BigDecimal costPrice = BigDecimal.valueOf(Double.parseDouble(costPriceString));

        return (Product) repository.saveObject(new Product(name, sellingPrice, costPrice, inStock, category, subCategory, size, supplier));
    }

    public List<Product> getAllProducts(){
        return (List<Product>) repository.getAllObjects();
    }

    public Product updateProduct(Product product){
        return (Product) repository.updateObject(product);
    }
    
    public List<Product> getFilteredProducts(Integer costPriceMin, Integer costPriceMax, Integer sellingPriceMin, 
            Integer sellingPriceMax, Integer profitMin, Integer profitMax, String name, Boolean availableInStock, 
            String category, String subCategory, String size, String supplierId){
        
        ProductFilter filter = new ProductFilter();
        filter.setName(name);
        filter.setAvailableInStock(availableInStock);
        filter.setCategory(category);
        filter.setSubCategory(subCategory);
        filter.setSize(size);
        filter.setCostPriceMin(costPriceMin);
        filter.setCostPriceMax(costPriceMax);
        filter.setSellingPriceMin(sellingPriceMin);
        filter.setSellingPriceMax(sellingPriceMax);
        filter.setProfitMin(profitMin);
        filter.setProfitMax(profitMax);
        filter.setSupplierId(Integer.parseInt(supplierId));
        
        return (List<Product>) repository.findObjectsWithFilters(filter);
    }

    public void removeProduct(Product productToRemove){
        repository.deleteObject(productToRemove);
    }
    
}
