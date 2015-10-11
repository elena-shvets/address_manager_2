package com.addresscrud.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Class {@link Address}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
@Entity
@Table(name="address")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")

public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_address", unique=true, nullable=false)
    private long id;

    @Column(name="address", nullable=false)
//    @OneToMany(mappedBy="address", cascade={CascadeType.ALL})
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private String addressContent;

    public String getAddressContent() {
        return addressContent;
    }

    public void setAddressContent(String addressContent) {
        this.addressContent = addressContent;
    }

    //    @Column(name="street", nullable=false, length=150)
//    private String street;
//
//    @Column(name="house", nullable=false, length=20)
//    private int houseNumber;
//
//    @Column(name="flat", nullable=false, length=10)
//    private int flat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
