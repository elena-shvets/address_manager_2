package com.addresscrud.repository.impl;

import com.addresscrud.model.City;
import com.addresscrud.model.Country;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.addresscrud.repository.CityRepository;
import sun.misc.Sort;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Class {@link CityRepositoryImpl}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
@Repository
@Transactional
public class CityRepositoryImpl implements CityRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public City save(City city) {
        entityManager.persist(city);
        return city;
    }

    @Override
    public City update(City city) {
        entityManager.merge(city);
        return city;
    }


    @Override
    public List<City> findByCountry(Country country) {
        return null;
    }

    @Override
    public City findByCityName(String cityName) {
        return null;
    }

    @Override
    public City findByCityNameAndCountry(String cityName, Country country) {
        return null;
    }


}
