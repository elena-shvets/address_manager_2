package com.addresscrud.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Class {@link Phone}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Entity
@Table(name="phones")
@NamedQuery(name="Phone.findAll", query="SELECT ph FROM Phone ph")
public class Phone implements Serializable {

    private long id;
    private String phoneNumber;
    private Address address;



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_phone", unique=true, nullable=false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name="phone_number", nullable=false, length=20)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address", nullable = false)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
