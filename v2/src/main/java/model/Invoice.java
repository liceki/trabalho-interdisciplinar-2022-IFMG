package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "invoice", schema = "espaco_mix")
public class Invoice {
    @Id
    @Column(name = "invoice_id", nullable = false)
    @GeneratedValue(generator = "increment")
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "invoice")
    private List<Product> cart;

    @Column(name = "date")
    private Date date;

    public Invoice() {
    }

    public Invoice(Client client, Date date) {
        this.client = client;
        this.cart = new ArrayList<>();
        this.date = date;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public void addProductToCart(Product product){
        this.cart.add(product);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
