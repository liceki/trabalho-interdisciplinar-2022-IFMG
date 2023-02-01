package table_model;

import controller.ClientController;
import interfaces.TableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Client;

public class ClientTableModel extends AbstractTableModel implements TableModel{
    private List<Client> clientsList;
    private ClientController controller;
    private String[] header = {"ID", "NAME", "CPF", "EMAIL", "PHONE NUMBER", 
        "GENDER", "BIRTHDATE", "Nº OF PURCHASES"};

    public ClientTableModel() {
        this.controller = new ClientController();
        
        loadObjects();
       
    }

    @Override
    public int getRowCount() {
        return this.clientsList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(this.clientsList.isEmpty() || rowIndex >= clientsList.size()) return null;
        
        Client clientTemp = this.clientsList.get(rowIndex);
        if(clientTemp == null) return null;
        
        switch (columnIndex){
            case 0: return clientTemp.getId();
            case 1: return clientTemp.getName();
            case 2: return clientTemp.getCpf();
            case 3: return clientTemp.getEmail();
            case 4: return clientTemp.getPhoneNumber();
            case 5: return clientTemp.getGender();
            case 6: return clientTemp.getBirthDate().toString().split(" ")[0];
            case 7: 
                if(clientTemp.getInvoices() == null) return 0;
                
                if(!clientTemp.getInvoices().isEmpty()){
                    return clientTemp.getInvoices().size();
                }
                return 0;
                
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    
    //methods from interface TableModel
    @Override
    public void loadObjects(){
        this.clientsList = this.controller.getAllClients();
    }
    
    @Override
    public void setResults(List results){
        this.clientsList = results;
    }
    
    @Override
    public void addObject(Object client){
        this.clientsList.add((Client) client);
    }

    @Override
    public Client getObjectAtRowIndex(int rowIndex){
        return this.clientsList.get(rowIndex);
    }

    @Override
    public void removeObjectAtRowIndex(int rowIndex){
        this.clientsList.remove(rowIndex);
    }
}
