package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import model.Product;
import model.filters.ProductFilter;

public class ProductRepository implements Repository{
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ProductRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

   @Override
    public Object saveObject(Object obj){
        Product product = (Product) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        return product;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(Product.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        Product product = (Product) obj;
        Product productToUpdate = (Product) findObjectById(product.getId());
        entityManager.getTransaction().begin();
        productToUpdate.updateProduct(product);
        entityManager.getTransaction().commit();
        return productToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        Product productToRemove = (Product) objToRemove;
        productToRemove = (Product) findObjectById(productToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(productToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_PRODUCTS").getResultList();
    }

    @Override
    public List findObjectsWithFilters(Object objFilter){
        ProductFilter productFilter = (ProductFilter) objFilter;
        Query query = entityManager.createNamedQuery("FIND_PRODUCTS_WITH_FILTERS");
//        query.setParameter("corporateName", productFilter.getCorporateName());
//        query.setParameter("cnpj", productFilter.getCnpj());
//        query.setParameter("email", productFilter.getEmail());
        return query.getResultList();
    }

    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }

}
