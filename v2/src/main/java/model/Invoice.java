package model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "invoice", schema = "espaco_mix")
public class Invoice {
    @Id
    @Column(name = "invoice_id", nullable = false)
    @GeneratedValue(generator = "increment")
    private int id;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "invoice")
    private List<Product> cart;

    private Date date;

    public Invoice() {
    }
}
