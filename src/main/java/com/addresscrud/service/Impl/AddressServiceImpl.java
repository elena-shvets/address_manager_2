package com.addresscrud.service.Impl;

import com.addresscrud.model.Address;
import com.addresscrud.repository.AddressRepository;
import com.addresscrud.service.AddressService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Class {@link AddressServiceImpl}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */

@Service("addressService")
public class AddressServiceImpl implements AddressService {

   private static final Logger LOG = Logger.getLogger(AddressServiceImpl.class);

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public Address save(Address address) {
        if(address==null){
            throw new IllegalArgumentException("Address must not be null");
        }
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address) {
        return addressRepository.update(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findOneById(Long id) {
        return addressRepository.findOneById(id);
    }


    @Override
    public void delete(Address address) {
        addressRepository.delete(address);

    }

    @Override
    public Address findByStreet(String street) {
        return addressRepository.findByStreet(street);
    }

    @Override
    public boolean checkAddressForExistById(Long id) {
        if(!entityManager.contains(findOneById(id))){
            return addressRepository.checkAddressForExistById(id);
        }
        return true;
    }
}
