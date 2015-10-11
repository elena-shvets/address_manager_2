package com.addresscrud.service.Impl;

import com.addresscrud.model.Address;
import com.addresscrud.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.addresscrud.repository.PhoneRepository;
import com.addresscrud.service.PhoneService;

import java.util.List;

/**
 * Class {@link PhoneServiceImpl}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
@Service("phoneService")
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public Phone update(Phone phone) {
        return phoneRepository.update(phone);
    }

    @Override
    public void delete(Phone phone) {
        phoneRepository.delete(phone);

    }

    @Override
    public Phone findById(long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public List<Phone> findAllByAddress(Address address) {
        return phoneRepository.findAllByAddress(address);
    }
}
