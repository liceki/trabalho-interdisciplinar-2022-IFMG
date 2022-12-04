package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "supplier", schema = "espaco_mix")
public class Supplier {
    @Id
    @Column(name = "supplier_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "corporate_name", length = 450)
    private String corporateName;

    @Column(name = "cnpj", length = 14)
    private String cnpj;

    @Column(name = "email", length = 450)
    private String email;

    @OneToMany(mappedBy = "supplier")
    private List<Product> suppliedProducts;


    public Supplier() {
    }

    public Supplier(String corporateName, String cnpj, String email) {
        this.corporateName = corporateName;
        this.cnpj = cnpj;
        this.email = email;
        this.suppliedProducts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getSuppliedProducts() {
        return suppliedProducts;
    }

    public void setSuppliedProducts(List<Product> suppliedProducts) {
        this.suppliedProducts = suppliedProducts;
    }

    public void addSupliedProduct(Product product){
        this.suppliedProducts.add(product);
    }
    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", corporateName='" + corporateName + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                ", suppliedProducts=" + suppliedProducts +
                '}';
    }
}
