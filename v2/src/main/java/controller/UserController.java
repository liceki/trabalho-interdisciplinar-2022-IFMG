package controller;

import interfaces.Repository;
import model.User;
import repository.UserRepository;

public class UserController {
    private Repository repository;

    public UserController() {
        this.repository = new UserRepository();
    }
    
    public User verifyCredentials(String login, String password){
        return (User) repository.findObjectsWithFilters(new User(login, password)).get(0);
    }
    
    public boolean isLoginAvailable(String login){
        return (User) (repository.findObjectsWithFilters(new User(login, ""))).get(0) == null;
    }
    
    public User registerUser(String name, String login, String password){
        //if(isLoginAvailable(login)){
            return (User) repository.saveObject(new User(name, login, password));
        //}
        //return null;
    }
}
