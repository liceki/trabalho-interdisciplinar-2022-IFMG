package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import model.User;

public class UserRepository implements Repository{
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public UserRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
    
    @Override
    public Object saveObject(Object obj){
        User User = (User) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(User);
        entityManager.getTransaction().commit();
        return User;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(User.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        User User = (User) obj;
        User UserToUpdate = (User) findObjectById(User.getId());
        entityManager.getTransaction().begin();
        UserToUpdate.updateUser(User);
        entityManager.getTransaction().commit();
        return UserToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        User UserToRemove = (User) objToRemove;
        UserToRemove = (User) findObjectById(UserToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(UserToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_USERS").getResultList();
    }

    @Override
    public List findObjectsWithFilters(Object objFilter){
        User UserFilter = (User) objFilter;
        Query query = entityManager.createNamedQuery("VERIFY_LOGIN");
        query.setParameter("login", UserFilter.getLogin());
        query.setParameter("password", UserFilter.getPassword());
        
        return query.getResultList();
    }

    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
