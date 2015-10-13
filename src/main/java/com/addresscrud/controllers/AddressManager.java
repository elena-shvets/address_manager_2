package com.addresscrud.controllers;


import com.addresscrud.dto.AddressDto;
import com.addresscrud.model.Address;
import com.addresscrud.model.Countries;
import com.addresscrud.service.AddressService;
import com.addresscrud.service.PhoneService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class {@link AddressManager}
 *
 * @author Elena Shvets
 * @version 1.0
 * @since 08.10.15
 */
@Controller
@RequestMapping("/address")
public class AddressManager {
    private static final Logger LOG = Logger.getLogger(AddressManager.class);

    @Autowired
    private AddressService addressService;

    @Autowired
    private PhoneService phoneService;

    /**Method that receives all objects from the database*
     * and return response with error message if something wrong. If everything ok -
     * returns list of objects
     * @return  formed result
     **/
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Address> getAllAddresses() {
        List<Address> addresses = addressService.findAll();
        if (CollectionUtils.isEmpty(addresses)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(addresses, HttpStatus.OK);

    }

    /**Method that adds an object to the database
     * and return response with error message if something wrong. If everything ok -
     * response with success message
     * @param  addressDto
     * @return result
     * **/
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Address> addAddress(@RequestBody AddressDto addressDto) {
        if (addressDto==null){
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
        Address address = new Address();
        address.setAddressContent(addressDto.getAddress());
        address.setCountries(Countries.valueOf(addressDto.getCountry()));
        addressService.save(address);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**Method that receives an object by id from the database
     *and return response with error message if something wrong. If everything ok -
     * response with success message
     * @param  addressId
     * @return result
     * **/
    @RequestMapping(value = "/{addressId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getOneById(@PathVariable Long addressId) {
        if (!addressService.checkAddressForExistById(addressId)){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(addressService.findOneById(addressId), HttpStatus.OK);
    }


//    @RequestMapping(value = "/removeAddress", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<Address> deleteAddress(@RequestParam(value = "id_address")  long addressId) {
////        if (addressId == 0) {
//        LOG.info("Can not delete address because request parameters are not correct");
////            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
////        }
//        Address address = addressService.findOneById(addressId);
//        addressService.delete(address);
//        return new ResponseEntity<Address>(HttpStatus.OK);
//    }
}
