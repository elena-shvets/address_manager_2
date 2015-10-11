//package java.com.addresscrud;
//
//import com.addresscrud.model.Address;
//import com.addresscrud.repository.AddressRepository;
//import com.addresscrud.service.AddressService;
//import com.addresscrud.service.Impl.AddressServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static org.mockito.Mockito.when;
//
///**
// * Created by elena on 11.10.15.
// */
//
//@RunWith(MockitoJUnitRunner.class)
//public class AddressServiceImplTest {
//
//    @Mock
//    AddressRepository addressRepository;
//
//    @InjectMocks
//    AddressService addressService = new AddressServiceImpl();
//
//
//    @Before
//    public void before() throws Exception {
//        Address address = new Address();
//        address.setId(1);
//        address.setStreet("Kirova");
//        address.setHouseNumber(5);
//        address.setFlat(25);
//
//    }
//
//    @Test
//    public void testSaveAddress(){
//        Address address = new Address();
//        when(addressRepository.save(address)).thenReturn(new Address());
//    }
//
////    @Test
////    public void testFindOneById() throws Exception{
////        Long id = new Long();
////        when(addressRepository.findOneById()).thenReturn(new Address());
////    }
////
////    @Test
////    public void testUpdateAddress() throws Exception{
////        doNothing().when(addressRepository).save((Address) anyObject());
////        when(addressRepository.findOneById(anyLong())).thenReturn(new Address());
////        addressService.update();
////        verify(addressRepository,atLeastOnce()).findOneById(anyLong());
////    }
//}
