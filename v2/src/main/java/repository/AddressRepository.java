package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Address;
import model.Client;

import java.util.List;

public class AddressRepository implements Repository{
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AddressRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Object saveObject(Object obj){
        Address address = (Address) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(address);
        entityManager.getTransaction().commit();
        return address;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(Address.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        Address address = (Address) obj;
        Address addressToUpdate = (Address) findObjectById(address.getId());
        entityManager.getTransaction().begin();
        addressToUpdate.updateAddress(address);
        //entityManager.refresh(addressToUpdate);
        entityManager.getTransaction().commit();
        return addressToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        Address addressToRemove = (Address) objToRemove;
        addressToRemove = (Address) findObjectById(addressToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(addressToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_ADDRESSES").getResultList();
    }
    
    @Override
    public List findObjectsWithFilters(Object objFilter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }

    
}
