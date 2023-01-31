package repository;

import interfaces.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;
import model.Invoice;

public class InvoiceRepository implements Repository{
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public InvoiceRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Object saveObject(Object obj){
        Invoice invoice = (Invoice) obj;
        entityManager.getTransaction().begin();
        entityManager.persist(invoice);
        entityManager.getTransaction().commit();
        return invoice;
    }

    @Override
    public Object findObjectById(int id){
        return entityManager.find(Invoice.class, id);
    }

    @Override
    public Object updateObject(Object obj){
        Invoice invoice = (Invoice) obj;
        Invoice invoiceToUpdate = (Invoice) findObjectById(invoice.getId());
        entityManager.getTransaction().begin();
        invoiceToUpdate.updateInvoice(invoice);
        entityManager.getTransaction().commit();
        return invoiceToUpdate;
    }

    @Override
    public void deleteObject(Object objToRemove){
        Invoice invoiceToRemove = (Invoice) objToRemove;
        invoiceToRemove = (Invoice) findObjectById(invoiceToRemove.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(invoiceToRemove);
        entityManager.getTransaction().commit();
    }

    @Override
    public List getAllObjects(){
        return entityManager.createNamedQuery("GET_ALL_SUPPLIERS").getResultList();
    }

    @Override
    public List findObjectsWithFilters(Object objFilter){
        Invoice invoiceFilter = (Invoice) objFilter;
        Query query = entityManager.createNamedQuery("FIND_PRODUCTS_WITH_FILTERS");
//        query.setParameter("corporateName", invoiceFilter.getCorporateName());
//        query.setParameter("cnpj", invoiceFilter.getCnpj());
//        query.setParameter("email", invoiceFilter.getEmail());
        return query.getResultList();
    }

    @Override
    public void close(){
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
}
