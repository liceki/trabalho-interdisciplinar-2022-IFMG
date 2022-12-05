package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client", schema = "espaco_mix")
@NamedQueries({
        @NamedQuery(name = "GET_ALL_CLIENTS",
                query = "SELECT c FROM Client c")
})
public class Client {
    @Id
    @Column(name = "client_id", nullable = false)
    @GeneratedValue(generator = "increment")
    private int id;

    @Column(name = "cpf")
    private int cpf;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany
    private List<Invoice> purchases;

    public Client() {

    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Invoice> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Invoice> purchases) {
        this.purchases = purchases;
    }

    public void addPurchase(Invoice invoice){
        this.purchases.add(invoice);
    }

    public void updateClient(Client client){
        this.cpf = client.getCpf();
        this.name = client.getName();
        this.email = client.getEmail();
        this.phoneNumber = client.getPhoneNumber();
        this.gender = client.getGender();
        this.birthDate = client.getBirthDate();
        this.address = client.getAddress();
        this.purchases = client.getPurchases();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                ", purchases=" + purchases +
                '}';
    }
}
