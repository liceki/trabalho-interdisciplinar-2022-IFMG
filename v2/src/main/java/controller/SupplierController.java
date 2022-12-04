package controller;

import model.Supplier;
import respository.SupplierRepository;

import java.util.List;

public class SupplierController {
    private SupplierRepository repository;

    public SupplierController() {
        repository = new SupplierRepository();
    }

    public List<Supplier> getAllSuppliers(){
        return repository.getAllSuppliers();
    }

    public Supplier addSupplier(String corporateName, String cnpf, String email){
        return repository.createSupplier(new Supplier(corporateName, cnpf, email));
    }
}
