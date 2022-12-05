package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Address;

import java.util.List;

public class AddressRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AddressRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("interdisciplinar");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Address saveAddress(Address address){
        entityManager.getTransaction().begin();
        entityManager.persist(address);
        entityManager.getTransaction().commit();
        return address;
    }

    public Address findAddressById(int id){
        return entityManager.find(Address.class, id);
    }

    public Address updateAddress(Address address){
        Address addressToUpdate = findAddressById(address.getId());
        entityManager.getTransaction().begin();
        addressToUpdate.updateAddress(address);
        entityManager.getTransaction().commit();
        return addressToUpdate;
    }

    public void deleteAddress(Address addressToRemove){
        addressToRemove = findAddressById(addressToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(addressToRemove);
        entityManager.getTransaction().commit();
    }

    public List<Address> getAllAddresses(){
        return entityManager.createNamedQuery("GET_ALL_ADDRESSES").getResultList();
    }

    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
