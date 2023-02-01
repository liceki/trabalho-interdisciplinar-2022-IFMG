package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import repository.ClientRepository;

public class ClientController {
    private ClientRepository repository;

    public ClientController() {
        repository = new ClientRepository();
    }

    public Client saveClient(String cpf, String name, String email, 
            String phoneNumber, Object gender, Object year, Object month, Object day){
        
//        String genderStr = (String) gender;
//        String yearStr = (String) year;
//        String monthStr = (String) month;
//        String dayStr = (String) day;
        
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(year + "-" + month + "-" + day);
        } catch (ParseException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Client) repository.saveObject(new Client(cpf, name, email, phoneNumber, (String)gender, birthDate));
    }
    
    public Client getClientById(int id){
        return (Client) repository.findObjectById(id);
    }

    public List<Client> getAllClients(){
        return (List<Client>) repository.getAllObjects();
    }

    public Client updateClient(Object client){
        return (Client) repository.updateObject(client);
    }
    
    public List<Client> getFilteredClients(String cpf, String name, String email, String phoneNumber, String gender, Date birthDate){
        return (List<Client>) repository.findObjectsWithFilters(new Client(cpf, name, email, phoneNumber, gender, birthDate));
    }

    public void removeClient(Client clientToRemove){
        repository.deleteObject(clientToRemove);
    }

}
