package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CustomerApplication {
    public static void main(String[] args) {
    Address brendaBillingAddress = new Address ("4545 gateway", "4545 gateway2", "Edmonds", "WA", "222");
    Address brendaShippingAddress = new Address("555 gateway", "4545 gateway2", "Edmonds", "WA", "222");
    Address brandonBillingAddress = new Address("1212 coolroad", "1212 coolroad2", "Bea", "WA", "888");
    Address brandonShippingAddress = new Address("1212 coolroad", "1212 coolroad2", "Bea", "WA", "888");

    Customer brenda = new Customer( "Brenda", "Kay", "brek@y.com", "89-67-98",  brendaBillingAddress, brendaShippingAddress, true );
    Customer brandon = new Customer("Brandon", "Kik", "bkik@y.com", "67-83-59", brandonBillingAddress, brandonShippingAddress, false   );
        Map<String, Customer> customers = new HashMap<>();

        customers.put("Brenda", brenda);
        customers.put("Brandon", brandon);

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a phone number ");
        String phoneNumber = scan.nextLine();

        System.out.println("The customer with the " + phoneNumber);

        Map<String, Customer> filteredMap =  filterByPhoneNumber(customers, phoneNumber);

        Set<String> keys = filteredMap.keySet();

        for(String key : keys) {
            System.out.println(key + " : " + customers.get(key).getFirstName() + " " + customers.get(key).getLastName());
        }

        System.out.print("Please enter an email ");
        String eMail = scan.nextLine();

        System.out.println("The customer with the " + eMail);

        Map<String, Customer> selectMap = filterByEMail(customers, eMail);
        Set<String> big = selectMap.keySet();

        for (String key : big) {
            System.out.println(key + " : " + customers.get(key).getFirstName() + " " + customers.get(key).getLastName());
        }


    }

    public static Map<String, Customer> filterByPhoneNumber(Map<String, Customer> customerMap, String phoneNumber) {
        Map<String, Customer> newMap = new HashMap<>();

        Set<String> keys = customerMap.keySet();

        for(String key : keys) {
            Customer customer = customerMap.get(key);
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                newMap.put(key, customer);
            }
        }

        return newMap;
    }

    public static Map<String, Customer> filterByEMail(Map<String, Customer> customerMap, String eMail) {
        Map<String, Customer> newMap = new HashMap<>();

        Set<String> big = customerMap.keySet();

        for(String key : big) {
            Customer customer = customerMap.get(key);
            if (customer.getEmail().equals(eMail)) {
                newMap.put(key, customer);
            }
        }

        return newMap;
    }

}
