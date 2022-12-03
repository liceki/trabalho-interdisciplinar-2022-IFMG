package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "sale", schema = "espaco_mix")
public class Sale {
    @Id
    private int id;

    @OneToOne
    private Client buyer;
    private List<Product> cart;
    private Date date;
}
