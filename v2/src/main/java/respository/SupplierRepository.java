package respository;

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

    public Supplier createSupplier(Supplier supplier){
        entityManager.getTransaction().begin();
        entityManager.persist(supplier);
        entityManager.getTransaction().commit();
        return supplier;
    }

    public Supplier findSupplier(int id){
        return entityManager.find(Supplier.class, id);
    }

    public Supplier updateSupplier(Supplier supplier){
        Supplier supplierToUpdate = findSupplier(supplier.getId());
        entityManager.getTransaction().begin();
        supplierToUpdate.setCnpj(supplier.getCnpj());
        supplierToUpdate.setCorporateName(supplier.getCorporateName());
        supplierToUpdate.setEmail(supplierToUpdate.getEmail());
        supplierToUpdate.setSuppliedProducts(supplier.getSuppliedProducts());
        entityManager.getTransaction().commit();
        return supplierToUpdate;
    }

    public void deleteSupplier(Supplier supplier){
        entityManager.getTransaction().begin();
        entityManager.remove(supplier);
        entityManager.getTransaction().commit();
    }

    public List<Supplier> getAllSuppliers(){
        return entityManager.createQuery("SELECT s FROM Supplier s").getResultList();
    }

    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}