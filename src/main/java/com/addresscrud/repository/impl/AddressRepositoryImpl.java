package com.addresscrud.repository.impl;

import com.addresscrud.model.Address;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.addresscrud.repository.AddressRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Class {@link AddressRepositoryImpl}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Repository
@Transactional
public class AddressRepositoryImpl implements AddressRepository {
    static final Logger LOG = Logger.getLogger(AddressRepositoryImpl.class);

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Address save(Address address) {
        //try {
            entityManager.persist(address);
        /*}catch (Exception e){

            LOG.error(e.getMessage());
            e.printStackTrace();
        }*/
        return address;
    }

    @Override
    public Address update(Address address) {
        entityManager.merge(address);
        return address;
    }


    @Override
    public List<Address> findAll() {
        Query query=entityManager.createQuery("from Address");
        return query.getResultList();

    }

    @Override
    public Address findOneById(Long id) {
        return entityManager.find(Address.class, id);
    }

    @Override
    public void delete(Address address) {
        Address removingAddress = entityManager.find(Address.class, address.getId());
        entityManager.remove(removingAddress);
    }

    @Override
    public Address findByStreet(String street) {
        return entityManager.find(Address.class, street);
    }
}
