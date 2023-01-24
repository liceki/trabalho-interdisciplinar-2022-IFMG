package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.*;

import java.util.List;

public class ClientRepository implements Repository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ClientRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Client saveClient(Client client){
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        return client;
    }

    public Client findClientById(int id){
        return entityManager.find(Client.class, id);
    }

    public Client updateClient(Client client){
        Client clientToUpdate = findClientById(client.getId());
        entityManager.getTransaction().begin();
        clientToUpdate.updateClient(client);
        //entityManager.refresh(clientToUpdate);
        entityManager.getTransaction().commit();
        return clientToUpdate;
    }

    public void deleteClient(Client clientToRemove){
        clientToRemove = findClientById(clientToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(clientToRemove);
        entityManager.getTransaction().commit();
    }

//    public Client setAddress(Client clientToSetAddress, Address address){
//        clientToSetAddress = findClientById(clientToSetAddress.getId());
//        entityManager.getTransaction().begin();
//        clientToSetAddress.setAddress(address);
//        entityManager.getTransaction().commit();
//        return clientToSetAddress;
//    }

    public List<Client> getAllClients(){
        return entityManager.createNamedQuery("GET_ALL_CLIENTS").getResultList();
    }

    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
