package com.addresscrud.model;

import javax.persistence.*;

/**
 * Class {@link City}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Entity
@Table(name="city")
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_city", unique=true, nullable=false)
    private long id;

    @Column(name="street", nullable=false, length=250)
    private String cityName;

//    Country country;

    public City() {
    }

    public City(String cityName, Country country) {
        this.cityName = cityName;
//        this.country = country;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }
}
