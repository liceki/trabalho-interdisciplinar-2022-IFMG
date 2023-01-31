package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import model.Product;

public class ProductRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ProductRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Product saveProduct(Product product){
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        return product;
    }

    public Product findProductById(int id){
        return entityManager.find(Product.class, id);
    }

    public Product updateProduct(Product product){
        Product productToUpdate = findProductById(product.getId());
        entityManager.getTransaction().begin();
        productToUpdate.updateProduct(product);
        entityManager.getTransaction().commit();
        return productToUpdate;
    }
    
    public void deleteProduct(Product productsToRemove){
        productsToRemove = findProductById(productsToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(productsToRemove);
        entityManager.getTransaction().commit();
    }

    public List<Product> getAllProducts(){
        return entityManager.createNamedQuery("GET_ALL_SUPPLIERS").getResultList();
    }

    public List<Product> findProductsWithFilters(Product productFilter){
        Query query = entityManager.createNamedQuery("FIND_SUPPLIERS_WITH_FILTERS");
//        query.setParameter("corporateName", supplierFilter.getCorporateName());
//        query.setParameter("cnpj", supplierFilter.getCnpj());
//        query.setParameter("email", supplierFilter.getEmail());
        return query.getResultList();
    }

    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }

}
