package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "supplier", schema = "espaco_mix")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "corporate_name", length = 450)
    private String corporateName;

    @Column(name = "cnpj")
    private String cnpj;

    @OneToMany()
    private List<Product> suppliedProducts;

}
