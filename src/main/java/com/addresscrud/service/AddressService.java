package com.addresscrud.service;

import com.addresscrud.model.Address;

import java.util.List;

/**
 * Class {@link AddressService}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

public interface AddressService {

    Address save(Address address);
    Address update(Address address);
    List<Address> findAll();
    Address findOneById(Long id);
    void delete(Address address);
    Address findByStreet(String street);

}
