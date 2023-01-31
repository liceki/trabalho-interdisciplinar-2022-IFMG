package controller;

import interfaces.Controller;
import java.math.BigDecimal;
import java.util.List;
import model.Product;
import repository.ProductRepository;

public class ProductController implements Controller {
     private ProductRepository repository;

    public ProductController() {
        repository = new ProductRepository();
    }

    public Product saveProduct(String name, String sellingPriceString, String costPriceString, boolean inStock){
        BigDecimal sellingPrice = BigDecimal.valueOf(Double.parseDouble(sellingPriceString));
        BigDecimal costPrice = BigDecimal.valueOf(Double.parseDouble(costPriceString));
        return repository.saveProduct(new Product(name, sellingPrice, costPrice, inStock, image));
    }

    public List<Product> getAllProducts(){
        return repository.getAllProducts();
    }

    public Product updateProduct(Product product){
        return repository.updateProduct(product);
    }
    
    public List<Product> getFilteredProducts(String nome, BigDecimal sellingPrice){
        return repository.findProductsWithFilters(new Product());
    }

    public void removeProduct(Product productToRemove){
        repository.deleteProduct(productToRemove);
    }
    
}
