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

    //@PrimaryKeyJoinColumn(name = "address")
    @OneToOne(mappedBy = "address")
    private Client client;

    @Column(name = "state", length = 450)
    private String state;

    @Column(name = "city", length = 450)
    private String city;

    @Column(name = "neighbourhood", length = 450)
    private String neighbourhood;

    @Column(name = "postal_code", length = 450)
    private String postalCode;

    @Column(name = "street", length = 450)
    private String street;

    @Column(name = "number")
    private int number;

    public Address() {
    }

    public Address(String state, String city, String neighbourhood, String postalCode, String street, int number) {
        this.state = state;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
    }

    public Address(Client client, String state, String city, String neighbourhood, String postalCode, String street, int number) {
        this.client = client;
        this.state = state;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.postalCode = postalCode;
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
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
        this.postalCode = address.getPostalCode();
        this.street = address.getStreet();
        this.number = address.getNumber();
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", client=" + client +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
