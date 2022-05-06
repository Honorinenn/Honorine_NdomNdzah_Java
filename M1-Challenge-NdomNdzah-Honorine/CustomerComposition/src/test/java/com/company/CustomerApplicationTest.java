package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

    public class CustomerApplicationTest {

        private Map<String, Customer> customers;

        @Before
        public void setUp() {
            Address brendaBillingAddress = new Address ("4545 gateway", "4545 gateway2", "Edmonds", "WA", "222");
            Address brendaShippingAddress = new Address("555 gateway", "4545 gateway2", "Edmonds", "WA", "222");
            Address brandonBillingAddress = new Address("1212 coolroad", "1212 coolroad2", "Bea", "WA", "888");
            Address brandonShippingAddress = new Address("1212 coolroad", "1212 coolroad2", "Bea", "WA", "888");

            Customer brenda = new Customer( "Brenda", "Kay", "brek@y.com", "89-67-98",  brendaBillingAddress, brendaShippingAddress, true );
            Customer brandon = new Customer("Brandon", "Kik", "bkik@y.com", "67-83-59", brandonBillingAddress, brandonShippingAddress, false   );

            customers = new HashMap<>();

            customers.put("Brenda", brenda);
            customers.put("Brandon", brandon);

        }

        @Test
        public void shouldFilterMapWhenGivenAPhoneNumber() {
            Map<String, Customer> filtered = CustomerApplication.filterByPhoneNumber(customers, "89-67-98" );
            assertEquals(1, filtered.size());
            assertTrue(filtered.containsKey("Brenda"));
        }

        @Test
        public void shouldFilterMapWhenGivenEMail() {
            Map<String, Customer> filtered = CustomerApplication.filterByEMail(customers, "bkik@y.com" );
            assertEquals(1, filtered.size());
            assertTrue(filtered.containsKey("Brandon"));

        }

    }


