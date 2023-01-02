package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
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

}
