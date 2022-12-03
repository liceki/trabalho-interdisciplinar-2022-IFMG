package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.nio.MappedByteBuffer;

@Entity
@Table(name = "product", schema = "espaco_mix")
public  class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    @Column(name = "name", length = 450)
    protected String name;

    @Column(name = "selling_price")
    protected BigDecimal sellingPrice;

    @Column(name = "cost_price")
    protected BigDecimal costPrice;

    @Column(name = "profit")
    protected BigDecimal profit;

    @ManyToOne
    protected Supplier supplier;
}
