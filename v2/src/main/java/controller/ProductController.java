package controller;

import interfaces.Controller;
import java.math.BigDecimal;
import java.util.List;
import model.Product;
import model.Supplier;
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
    
    public List<Product> getFilteredProducts(String nome, BigDecimal sellingPrice){
        return (List<Product>) repository.findObjectsWithFilters(new Product());
    }

    public void removeProduct(Product productToRemove){
        repository.deleteObject(productToRemove);
    }
    
}
