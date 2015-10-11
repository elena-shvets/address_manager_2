package com.addresscrud.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Class {@link Address}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
@Entity
@Table(name="addresses")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable{

    private Long id;
    private String addressContent;
    private List<Phone> phones;
    private Countries countries;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_address", unique=true, nullable=false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "address", nullable = false)
    public String getAddressContent() {
        return addressContent;
    }

    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Enumerated(EnumType.STRING)
    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    //    @Column(name="street", nullable=false, length=150)
//    private String street;
//
//    @Column(name="house", nullable=false, length=20)
//    private int houseNumber;
//
//    @Column(name="flat", nullable=false, length=10)
//    private int flat;



//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public int getHouseNumber() {
//        return houseNumber;
//    }
//
//    public void setHouseNumber(int houseNumber) {
//        this.houseNumber = houseNumber;
//    }
//
//    public int getFlat() {
//        return flat;
//    }
//
//    public void setFlat(int flat) {
//        this.flat = flat;
//    }
}
