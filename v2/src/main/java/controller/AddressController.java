package controller;

import java.math.BigDecimal;
import java.util.List;
import model.Address;
import repository.AddressRepository;

public class AddressController {
    private AddressRepository repository;

    public AddressController() {
        repository = new AddressRepository();
    }

    public Address saveAddress(String state, String city, String neighbourhood, String zipCode, String street, String number){
        return (Address) repository.saveObject(new Address(state, city, neighbourhood, zipCode, street, Integer.parseInt(number)));
    }

    public List<Address> getAllAddresses(){
        return (List<Address>) repository.getAllObjects();
    }

    public Address updateAddress(Address address){
        return (Address) repository.updateObject(address);
    }
    
    public List<Address> getFilteredAddresses(String nome, BigDecimal sellingPrice){
        return (List<Address>) repository.findObjectsWithFilters(new Address());
    }

    public void removeAddress(Address addressToRemove){
        repository.deleteObject(addressToRemove);
    }
}
