package controller;

import model.Supplier;
import repository.SupplierRepository;

import java.util.List;

public class SupplierController {
    private SupplierRepository repository;

    public SupplierController() {
        repository = new SupplierRepository();
    }

    public Supplier saveSupplier(String corporateName, String cnpf, String email){
        return (Supplier) repository.saveObject(new Supplier(corporateName, cnpf, email));
    }

    public List<Supplier> getAllSuppliers(){
        return (List<Supplier>) repository.getAllObjects();
    }

    public Supplier updateSupplier(Object supplier){
        return (Supplier) repository.updateObject(supplier);
    }
    
    public List<Supplier> getFilteredSuppliers(String corporateName, String cnpf, String email){
        return (List<Supplier>) repository.findObjectsWithFilters(new Supplier(corporateName, cnpf, email));
    }

    public void removeSupplier(Supplier supplierToRemove){
        repository.deleteObject(supplierToRemove);
    }


}
