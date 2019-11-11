package com.example.restaurantManagement.restaurantManagement.InventoryTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
@SpringBootTest
public class InventoryDomainTest {

    private InventoryDomain testInventoryDomain;

    @Test
    public void testInventoryDomainConstructorWithParams(){

        testInventoryDomain = new InventoryDomain(7, 5, 10, "Onion", "Fresh");

        new Verifications(){{
            assertEquals(7, testInventoryDomain.getId());
            assertEquals(5, testInventoryDomain.getQuantity());
            assertEquals(10, testInventoryDomain.getThreshold());
            assertEquals("Onion", testInventoryDomain.getFirstName());
            assertEquals("Fresh", testInventoryDomain());
        }};
    }

    @Test
    public void testId(){
        testInventoryDomain = new InventoryDomain();

        //No ID initially
        new Verifications(){{
            assertEquals(null, testInventoryDomain.getId());
        }};

        //When ID has a value
        testInventoryDomain.setId(4);

        new Varifications(){{
            assertEquals(4, testInventoryDomain.getId());
        }};
    }

    @Test
    public void testQuantity(){
        //No Quantity Initially
        testInventoryDomain = new InventoryDomain();

        new Verifications(){{
            assertEquals(null, testInventoryDomain.getQuantity());
        }};

        //When Quantity has a Value
        testInventoryDomain.setQuantity(88);

        new Verifications(){{
            asertEquals(88, testInventoryDomain.getQuantity());
        }};
    }

    @Test
    public void testThreshold(){
        //No Threshold Initially
        testInventoryDomain = new InventoryDomain();

        new Verifications(){{
            assertEquals(null, testInventoryDomain.getThreshold());
        }};

        //When Threshold has a Value
        testInventoryDomain.setThreshold(88);

        new Verifications(){{
            asertEquals(88, testInventoryDomain.getThreshold());
        }};
    }

    @Test
    public void testFirstName(){
        //no Firstname initially
        testInventoryDomain = new InventoryDomain();

        new Verifications(){{
            assertEquals(null, testInventoryDomain.getFirstName());
        }};

        //When firstName has a value
        testInventoryDomain.setFirstName("Matt");

        new Verifications(){{
            assertEquals("Matt", testInventoryDomain.getFirstname());
        }};
    }

    @Test
    public void testLastName(){
        //no Lastname initially
        testInventoryDomain = new InventoryDomain();

        new Verifications(){{
            assertEquals(null, testInventoryDomain.getLastName());
        }};

        //When lastName has a value
        testInventoryDomain.setLastName("Matt");

        new Verifications(){{
            assertEquals("Matt", testInventoryDomain.getLastname());
        }};
    }
}