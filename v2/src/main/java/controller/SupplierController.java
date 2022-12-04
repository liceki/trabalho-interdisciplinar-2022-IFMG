package controller;

import model.Supplier;
import respository.SupplierRepository;

import java.util.List;

public class SupplierController {
    private SupplierRepository repository;

    public SupplierController() {
        repository = new SupplierRepository();
    }

    public Supplier addSupplier(String corporateName, String cnpf, String email){
        return repository.createSupplier(new Supplier(corporateName, cnpf, email));
    }

    public List<Supplier> getAllSuppliers(){
        return repository.getAllSuppliers();
    }

    public List<Supplier> getFilteredSuppliers(){
        Supplier supplierFilter = new Supplier();
        supplierFilter.setCorporateName("es");
        supplierFilter.setEmail("@");
        return repository.findSuppliersWithFilters(supplierFilter);
    }

    public void removeSupplier(Supplier supplierToRemove){
        repository.deleteSupplier(supplierToRemove);
    }


}
