package model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product", schema = "espaco_mix")
public  class Product {
    @Id
    @Column(name = "product_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", length = 450)
    private String name;

    @Column(name = "selling_price")
    private BigDecimal sellingPrice;

    @Column(name = "cost_price")
    private BigDecimal costPrice;

    @Column(name = "profit")
    private BigDecimal profit;

    @Column(name = "in_stock")
    private boolean inStock;

    @Column(name = "image", length = 2048)
    private String image;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Invoice invoice;


    public Product() {
    }


}
