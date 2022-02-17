package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    Customer customer;
    Address address;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
        address = new Address();

        address.setStreet1("48");
        address.setStreet2("Mastic Blvd");
        address.setCity("Mastic");
        address.setState("NY");
        address.setZipcode("11925");

        customer.setBillingAddress(address);
        customer.setShippingAddress(address);

        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("johnD@gmail.com");
        customer.setPhoneNumber("6239803278");
        customer.setRewardsMember(true);
    }

    @Test
    public void shouldGetAllCustomerInfo() {

        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("johnD@gmail.com", customer.getEmail());
        assertEquals("6239803278", customer.getPhoneNumber());
        assertEquals(true, customer.isRewardsMember());
        assertEquals("48", customer.getBillingAddress().getStreet1());
        assertEquals("Mastic Blvd", customer.getBillingAddress().getStreet2());
        assertEquals("Mastic", customer.getBillingAddress().getCity());
        assertEquals("NY", customer.getBillingAddress().getState());
        assertEquals("11925", customer.getBillingAddress().getZipcode());
        assertEquals("48", customer.getShippingAddress().getStreet1());
        assertEquals("Mastic Blvd", customer.getShippingAddress().getStreet2());
        assertEquals("Mastic", customer.getShippingAddress().getCity());
        assertEquals("NY", customer.getShippingAddress().getState());
        assertEquals("11925", customer.getShippingAddress().getZipcode());
    }
}