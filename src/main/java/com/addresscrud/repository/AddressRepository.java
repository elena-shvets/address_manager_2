package com.addresscrud.repository;

import com.addresscrud.model.Address;

import java.util.List;

/**
 * Class {@link AddressRepository}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
public interface AddressRepository {


    Address save(Address address);
    Address update(Address address);
    List<Address> findAll();
    Address findOneById(long id);
    void delete(Address address);
    Address findByStreet(String street);


}
