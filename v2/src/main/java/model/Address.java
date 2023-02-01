package model;

import jakarta.persistence.*;

@Entity
@Table(name = "address", schema = "espaco_mix")
@NamedQueries({
        @NamedQuery(name = "GET_ALL_ADDRESSES",
                query = "SELECT a FROM Address a")
})
public class Address {
    @Id
    @GeneratedValue(generator = "increment")
    @Column(name = "address_id")
    private int id;

    @Column(name = "state", length = 450)
    private String state;

    @Column(name = "city", length = 450)
    private String city;

    @Column(name = "neighbourhood", length = 450)
    private String neighbourhood;

    @Column(name = "zip_code", length = 450)
    private String zipCode;

    @Column(name = "street", length = 450)
    private String street;

    @Column(name = "number")
    private int number;

    @OneToOne(mappedBy = "address")
    private Client client;

    public Address() {
    }

    public Address(String state, String city, String neighbourhood, String zipCode, String street, int number) {
        this.state = state;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
    }

    public Address(Client client, String state, String city, String neighbourhood, String zipCode, String street, int number) {
        this.client = client;
        this.state = state;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getPostalCode() {
        return zipCode;
    }

    public void setPostalCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void updateAddress(Address address){
        this.client = address.getClient();
        this.state = address.getState();
        this.neighbourhood = address.getNeighbourhood();
        this.zipCode = address.getPostalCode();
        this.street = address.getStreet();
        this.number = address.getNumber();
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", client=" + client +
                '}';
    }

    public String toStringFromClient(){
        return "Address{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
