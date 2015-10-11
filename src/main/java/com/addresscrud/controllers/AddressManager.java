package com.addresscrud.controllers;


import com.addresscrud.model.Address;
import com.addresscrud.service.AddressService;
import com.addresscrud.service.PhoneService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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
    static final Logger LOG = Logger.getLogger(AddressManager.class);

    @Autowired
    AddressService addressService;

    @Autowired
    PhoneService phoneService;



    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Address> getAllAddresses(){
        List<Address> addresses = addressService.findAll();
        if (CollectionUtils.isEmpty(addresses)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(addresses, HttpStatus.OK);

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Address> addAddress(@RequestBody Address address,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        if(address.getId() == 0){

//        Address address = new Address();
//            address.setId(4);
//            address.setAddressContent(addressDto.getAddress());
            addressService.save(address);
            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
    }

    @RequestMapping(value = "/{addressId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getOneById(@PathVariable long addressId) {

        return new ResponseEntity(addressService.findOneById(addressId), HttpStatus.OK);
    }


    @RequestMapping(value = "/removeAddress", method = RequestMethod.DELETE)
    @ResponseBody
    public  ResponseEntity<Address> deleteAddress(@RequestParam(value = "addressId") long addressId){
        if(addressId == 0) {
            LOG.info("Can not delete address because request parameters are not correct");
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
        Address address = addressService.findOneById(addressId);
        addressService.delete(address);
        return new ResponseEntity<Address>(HttpStatus.OK);
    }
}
