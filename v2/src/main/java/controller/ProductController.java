package controller;

import interfaces.Controller;
import java.util.List;
import model.Product;
import repository.ProductRepository;

public class ProductController implements Controller {
     private ProductRepository repository;

    public ProductController() {
        repository = new ProductRepository();
    }

    public Product saveProduct(String corporateName, String cnpf, String email){
        return repository.saveProduct(new Product());
    }

    public List<Product> getAllProducts(){
        return repository.getAllProducts();
    }

    public Product updateProduct(Product product){
        return repository.updateProduct(product);
    }
    
    public List<Product> getFilteredProducts(String corporateName, String cnpf, String email){
        return repository.findProductsWithFilters(new Product());
    }

    public void removeProduct(Product productToRemove){
        repository.deleteProduct(productToRemove);
    }
    
}
