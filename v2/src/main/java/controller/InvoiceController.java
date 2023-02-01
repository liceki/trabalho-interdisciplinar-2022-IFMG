package controller;

import java.util.Date;
import java.util.List;
import model.Invoice;
import repository.InvoiceRepository;

public class InvoiceController {
    private InvoiceRepository repository;

    public InvoiceController() {
        repository = new InvoiceRepository();
    }

    public Invoice saveInvoice(String cpf, String name, String email, String phoneNumber, String gender, Date birthDate){
        return (Invoice) repository.saveObject(new Invoice(cpf, name, email, phoneNumber, gender, birthDate));
    }
    
    public Invoice getInvoiceById(int id){
        return (Invoice) repository.findObjectById(id);
    }

    public List<Invoice> getAllInvoices(){
        return (List<Invoice>) repository.getAllObjects();
    }

    public Invoice updateInvoice(Object invoice){
        return (Invoice) repository.updateObject(invoice);
    }
    
    public List<Invoice> getFilteredInvoices(String cpf, String name, String email, String phoneNumber, String gender, Date birthDate){
        return (List<Invoice>) repository.findObjectsWithFilters(new Invoice(cpf, name, email, phoneNumber, gender, birthDate));
    }

    public void removeInvoice(Invoice invoiceToRemove){
        repository.deleteObject(invoiceToRemove);
    }
}
