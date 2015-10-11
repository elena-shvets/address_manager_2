package com.addresscrud.repository;

import com.addresscrud.model.Address;
import com.addresscrud.model.Phone;

import java.util.List;

/**
 * Class {@link PhoneRepository}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
public interface PhoneRepository {

    Phone save(Phone phone);
    Phone update(Phone phone);
    void delete(Phone phone);
    Phone findById(long id);
    List<Phone> findAllByAddress(Address address);
}
