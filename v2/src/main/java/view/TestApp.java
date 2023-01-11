//package view;
//
//import model.*;
//import repository.*;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//public class TestApp {
//
//    public static void main(String[] args) {
//        SupplierView s = new SupplierView();
//        s.setVisible(true);
//        
////        AddressRepository addressRepository = new AddressRepository();
////        ClientRepository clientRepository = new ClientRepository();
////        InvoiceRepository invoiceRepository = new InvoiceRepository();
////        ProductRepository productRepository = new ProductRepository();
////        SupplierRepository supplierRepository = new SupplierRepository();
////
////        //SupplierView.iniciarFrameFornecedor();
////
////        Client client = new Client("1234512345", "Henrique", "henrique@gmail.com",
////                "31971182315", "Masculino", new Date());
////        Address address = new Address("Minas Gerais", "Ouro Branco", "Pioneiros",
////                "36492323", "Rua Artur Bernardes", 56);
////        Product product = new Product("Boné", BigDecimal.valueOf(20.30), BigDecimal.valueOf(11.25),
////                true, "bone.png");
////        Product product2 = new Product("Vestido", BigDecimal.valueOf(79.90), BigDecimal.valueOf(33.50),
////                true, "vestido.png");
////        Supplier supplier = new Supplier("Pitanga Doce", "1112223334455",
////                "contato@pitanga.com");
////
//////        Supplier s = supplierRepository.findSupplierById(1);
//////        System.out.println(s.toString());
//////        for(Product p: s.getSuppliedProducts()){
//////            System.out.println(p.toString());
//////        }
////
////        addressRepository.saveAddress(address);
////        client.setAddress(address);
////        clientRepository.saveClient(client);
////
////
////
////        supplierRepository.saveSupplier(supplier);
////        product.setSupplier(supplier);
////        product2.setSupplier(supplier);
////        productRepository.saveProduct(product);
////        productRepository.saveProduct(product2);
////
////
////
////        Invoice invoice = new Invoice(client, new Date());
////        invoice.addProductToCart(product);
////        invoice.addProductToCart(product2);
////        product.setInvoice(invoice);
////        product2.setInvoice(invoice);
////        invoiceRepository.saveInvoice(invoice);
////
////        productRepository.updateProduct(product);
////        productRepository.updateProduct(product2);
////
////        invoice = invoiceRepository.findInvoiceById(1);
////        System.out.printf(invoice.toString());
//
//
//    }
//}