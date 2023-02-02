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
    
    public List<Product> getFilteredProducts(double costPriceMin, double costPriceMax, double sellingPriceMin, 
            double sellingPriceMax, double profitMin, double profitMax, String name, Boolean availableInStock, 
            Object category, Object subCategory, Object size, int supplierId){
        
        ProductFilter filter = new ProductFilter();
        filter.setName(name);
        filter.setAvailableInStock(availableInStock.toString());
        filter.setCategory((String)category);
        filter.setSubCategory((String) subCategory);
        filter.setSize((String) size);
        filter.setCostPriceMin(costPriceMin+"");
        filter.setCostPriceMax(costPriceMax+"");
        filter.setSellingPriceMin(sellingPriceMin+"");
        filter.setSellingPriceMax(sellingPriceMax+"");
        filter.setProfitMin(profitMin+"");
        filter.setProfitMax(profitMax+"");
        filter.setSupplierId(supplierId+"");
        
        return (List<Product>) repository.findObjectsWithFilters(filter);
    }

    public void removeProduct(Product productToRemove){
        repository.deleteObject(productToRemove);
    }
    
}
