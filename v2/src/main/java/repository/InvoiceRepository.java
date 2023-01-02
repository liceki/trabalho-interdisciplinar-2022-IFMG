package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Invoice;

public class InvoiceRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public InvoiceRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("postgresql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Invoice saveInvoice(Invoice invoice){
        entityManager.getTransaction().begin();
        entityManager.persist(invoice);
        entityManager.getTransaction().commit();
        return invoice;
    }

    public Invoice findInvoiceById(int id){
        return entityManager.find(Invoice.class, id);
    }
}
