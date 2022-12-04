package org.example;

import view.*;

public class Main {
    public static void main(String[] args) {
        //ClienteVIEW.viewCliente();
        SupplierView.iniciarFrameFornecedor();

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("interdisciplinar");
//        EntityManager em = emf.createEntityManager();
//
//        Supplier supplier = em.find(Supplier.class, 2);
//
//        Product product1 = new Product("Vestido", BigDecimal.valueOf(20.50), BigDecimal.valueOf(11.50), true, "img-vestido.jpg", supplier);
//        Product product2 = new Product("Calça", BigDecimal.valueOf(89.90), BigDecimal.valueOf(44.50), false, "img-calca.jpg", supplier);
//
//        supplier.addSupliedProduct(product1);
//        supplier.addSupliedProduct(product2);
//
//
//
//        em.getTransaction().begin();
//        em.persist(product1);
//        em.persist(product2);
//        em.getTransaction().commit();
//
//        System.out.println(supplier.toString());
//
//        em.close();
//        emf.close();


    }
}