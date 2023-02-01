package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "user", schema = "espaco_mix")
@NamedQueries({
        @NamedQuery(name = "GET_ALL_USERS",
                query = "SELECT u FROM User u"),
        @NamedQuery(name = "VERIFY_LOGIN",
                query = "SELECT u FROM User u " +
                        "WHERE (u.login) = (:login)" +
                        "AND (u.password) = (:password)")
    })
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(generator = "increment")
    private int id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "login", nullable = false)
    private String login;
    
    @Column(name = "password", nullable = false)
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User(int id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void updateUser(User user){
        
    }
    
}
