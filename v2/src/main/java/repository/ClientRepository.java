package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Client;

import java.util.List;

public class ClientRepository implements Repository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ClientRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Object saveObject(Object obj){
        Client client = (Client) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(client);
        entityManager.getTransaction().commit();
        return client;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(Client.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        Client client = (Client) obj;
        Client clientToUpdate = (Client) findObjectById(client.getId());
        entityManager.getTransaction().begin();
        clientToUpdate.updateClient(client);
        entityManager.getTransaction().commit();
        return clientToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        Client clientToRemove = (Client) objToRemove;
        clientToRemove = (Client) findObjectById(clientToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(clientToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_CLIENTS").getResultList();
    }

    @Override
    public List findObjectsWithFilters(Object objFilter){
        Client supplierFilter = (Client) objFilter;
        Query query = entityManager.createNamedQuery("FIND_CLIENTS_WITH_FILTERS");
        return query.getResultList();
    }

    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
