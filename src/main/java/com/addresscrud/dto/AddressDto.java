package com.addresscrud.dto;

import com.addresscrud.model.Phone;

import java.util.ArrayList;

/**
 * Class {@link Phone}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 10.10.15
 */

public class AddressDto {

    private String country;
    private String address;
    private ArrayList<String> phones;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }
}
