package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Invoice;

public class InvoiceRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public InvoiceRepository() {
        entityManagerFactory = Persistence.createEntityManagerFactory("interdisciplinar-mysql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Invoice saveInvoice(Invoice invoice){
        entityManager.getTransaction().begin();
        entityManager.persist(invoice);
        entityManager.getTransaction().commit();
        return invoice;
    }
}
