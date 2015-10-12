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
@Table(name="cities")
@NamedQuery(name="Cities.findAll", query="SELECT c FROM City c")
public class City {

    private long id;
    private String cityName;
    private Country country;


    public City() {
    }

    public City(String cityName, Country country) {
        this.cityName = cityName;
        this.country = country;

    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_city", unique=true, nullable=false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="city_name", nullable=false, length=250)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country", nullable = false)
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
