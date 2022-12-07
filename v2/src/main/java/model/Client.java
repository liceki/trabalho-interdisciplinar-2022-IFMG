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

    @Column(name = "cpf", length = 12)
    private String cpf;

    @Column(name = "name", length = 450)
    private String name;

    @Column(name = "email", length = 450)
    private String email;

    @Column(name = "phone_number", length = 11)
    private String phoneNumber;

    @Column(name = "gender", length = 155)
    private String gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "client", cascade = CascadeType.REMOVE)
    private List<Invoice> invoices;

    public Client() {

    }

    public Client(String cpf, String name, String email, String phoneNumber, String gender, Date birthDate) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Client(String cpf, String name, String email, String phoneNumber, String gender, Date birthDate, Address address, List<Invoice> invoices) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.invoices = invoices;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> purchases) {
        this.invoices = purchases;
    }

    public void addInvoice(Invoice invoice){
        this.invoices.add(invoice);
    }

    public void updateClient(Client client){
        this.cpf = client.getCpf();
        this.name = client.getName();
        this.email = client.getEmail();
        this.phoneNumber = client.getPhoneNumber();
        this.gender = client.getGender();
        this.birthDate = client.getBirthDate();
        this.address = client.getAddress();
        this.invoices = client.getInvoices();
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
                ", purchases=" + invoices +
                '}';
    }
}
