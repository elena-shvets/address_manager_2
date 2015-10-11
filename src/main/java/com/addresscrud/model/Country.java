package com.addresscrud.model;


import javax.persistence.*;
import java.util.List;

/**
 * Class {@link Country}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Entity
@Table(name="country")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country {

    private long id;
    private String countryName;
    private String phoneCode;
    private List<City> cities;

    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_country", unique=true, nullable=false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    @Column(name="country_name", nullable=false, length=256)
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Column(name="phone_code", nullable=false, length=5)
    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    //bi-directional many-to-one association to City
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Country country = (Country) o;

        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        return result;
    }
}
