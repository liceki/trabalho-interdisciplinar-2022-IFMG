package repository;

import jakarta.persistence.*;
import model.Supplier;

import java.util.List;

public class SupplierRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public SupplierRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("interdisciplinar");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Supplier saveSupplier(Supplier supplier){
        entityManager.getTransaction().begin();
        entityManager.persist(supplier);
        entityManager.getTransaction().commit();
        return supplier;
    }

    public Supplier findSupplierById(int id){
        return entityManager.find(Supplier.class, id);
    }

    public Supplier updateSupplier(Supplier supplier){
        Supplier supplierToUpdate = findSupplierById(supplier.getId());
        entityManager.getTransaction().begin();
        supplierToUpdate.updateSupplier(supplier);
        entityManager.getTransaction().commit();
        return supplierToUpdate;
    }

    public void deleteSupplier(Supplier supplierToRemove){
        supplierToRemove = findSupplierById(supplierToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(supplierToRemove);
        entityManager.getTransaction().commit();
    }

    public List<Supplier> getAllSuppliers(){
        return entityManager.createNamedQuery("GET_ALL_SUPPLIERS").getResultList();
    }

    public List<Supplier> findSuppliersWithFilters(Supplier supplierFilter){
        Query query = entityManager.createNamedQuery("FIND_SUPPLIERS_WITH_FILTERS");
        query.setParameter("corporateName", supplierFilter.getCorporateName());
        query.setParameter("email", supplierFilter.getEmail());
        return query.getResultList();
    }

    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
