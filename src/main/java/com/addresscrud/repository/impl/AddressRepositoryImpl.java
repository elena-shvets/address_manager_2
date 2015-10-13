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
    private static final Logger LOG = Logger.getLogger(AddressRepositoryImpl.class);

    @PersistenceContext
   private EntityManager entityManager;

    @Override
    public Address save(Address address) {
        entityManager.persist(address);

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

    @Override
    public boolean checkAddressForExistById(Long id) {
        return entityManager.find(Address.class, id)!=null;
    }
}
