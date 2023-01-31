package repository;

import interfaces.Repository;
import jakarta.persistence.*;
import model.Supplier;

import java.util.List;

public class SupplierRepository implements Repository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public SupplierRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Object saveObject(Object obj){
        Supplier supplier = (Supplier) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(supplier);
        entityManager.getTransaction().commit();
        return supplier;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(Supplier.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        Supplier supplier = (Supplier) obj;
        Supplier supplierToUpdate = (Supplier) findObjectById(supplier.getId());
        entityManager.getTransaction().begin();
        supplierToUpdate.updateSupplier(supplier);
        entityManager.getTransaction().commit();
        return supplierToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        Supplier supplierToRemove = (Supplier) objToRemove;
        supplierToRemove = (Supplier) findObjectById(supplierToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(supplierToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_SUPPLIERS").getResultList();
    }

    @Override
    public List findObjectsWithFilters(Object objFilter){
        Supplier supplierFilter = (Supplier) objFilter;
        Query query = entityManager.createNamedQuery("FIND_SUPPLIERS_WITH_FILTERS");
        query.setParameter("corporateName", supplierFilter.getCorporateName());
        query.setParameter("cnpj", supplierFilter.getCnpj());
        query.setParameter("email", supplierFilter.getEmail());
        return query.getResultList();
    }

    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
