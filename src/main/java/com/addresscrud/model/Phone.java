package com.addresscrud.model;

import javax.persistence.*;

/**
 * Class {@link Phone}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Entity
@Table(name="phone")
@NamedQuery(name="Phone.findAll", query="SELECT ph FROM Phone ph")

public class Phone {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_phone", unique=true, nullable=false)
    public long id;

    @Column(name="phone_number", nullable=false, length=250)
    private String phoneNumber;



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
