package com.company;

public class App {

    public static void main(String[] args) {

        Address address = new Address();
        Customer customer = new Customer();

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

        System.out.println("------ Customer Info -------");
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getPhoneNumber());
        System.out.println(customer.isRewardsMember());
        System.out.println("Shipping Address: " + customer.getShippingAddress());
        System.out.println("Billing Address: " + customer.getBillingAddress());

    }
}
