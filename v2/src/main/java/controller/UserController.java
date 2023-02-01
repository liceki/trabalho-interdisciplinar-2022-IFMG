package controller;

import interfaces.Repository;
import model.User;
import repository.UserRepository;

public class UserController {
    private Repository repository;

    public UserController() {
        this.repository = new UserRepository();
    }
    
    
    
    public User verifyLogin(String login, String password){
        return (User) repository.findObjectsWithFilters(new User(login, password)).get(0);
    }
}
