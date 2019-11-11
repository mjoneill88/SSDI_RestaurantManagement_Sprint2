package com.example.restaurantManagement.restaurantManagement.EntreeTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
@SpringBootTest
public class EntreeDomainTest {
    private EntreeDomain testEntreeDomain;

    @Test
    public void testEntreeDomainConstructorWithParams(){
        testEntreeDomain = new EntreeDomain(1, "Spaghetti", 10.5);

        new Verifications() {{
            assertEquals(1, testEntreeDomain.getId());
            assertEquals("Spaghetti", testEntreeDomain.getName());
            assertEquals(10.5, testEntreeDomain.getPrice());
        }};
    }

    @Test
    public void testId(){
        //no id initially
        testEntreeDomain = new EntreeDomain();

        new Verifications(){{
            assertEquals(null, testEntreeDomain.getId());
        }};

        //When id has value
        testEntreeDomain = new EntreeDomain(2);

        new Verifications{{
            assertEquals(2, testEntreeDomain.getId());
        }};
    }

    @Test
    public void testSetName(){
        //no name initially
        testEntreeDomain = new EntreeDomain();

        new Verifications(){{
            assertEquals(null, testEntreeDomain.getName());
        }};

        //When Name has a value
        testEntreeDomain.setName("Burrito");

        new Varifications(){{
            assertEquals("Burrito", testEntreeDomain.getName());
        }};
    }

    @Test
    public void testSetPrice(){
        //no price initially
        testEntreeDomain = new EntreeDomain();

        new Verifications(){{
            assertEquals(null, testEntreeDomain.getPrice());
        }};

        //When Price has a value
        testEntreeDomain.setPrice(6.75);

        new Verififications(){{
            assertEquals(6.75, testEntreeDomain.getPrice();
        }};
    }
}