package com.example.restaurantManagement.restaurantManagement.UserTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
@SpringBootTest
public class UserDomainTest {

    private UserDomain testUserDomain;

    @Test
    public void testUserDomainConstructorWithParams(){
        //Not sure if this works
        //
        Set<RestaurantDomain> testRestaurantDomain = new HashSet<>();
        //

        testUserDomain = new UserDomain(1, "jdawg@gmail.com", "password", "jDawg", "John", "Dawson", testRestaurantDomain);

        new Verifications(){{
            assertEquals(1, testUserDomain.getId());
            assertEquals("jdawg@egmail.com", testUserDomain.getEmail());
            assertEquals("password", testUserDomain.getPassword());
            assertEquals("jDawg", testUserDomain.getUserName());
            assertEquals("John", testUserDomain.getFirstName());
            assertEquals("Dawson", testUserDomain.getFirstName());
            assertEquals(testRestaurantDomain, testUserDomain.getRestaurantDomain());
        }};
    }

    @Test
    public void testId(){
        testUserDomain = new UserDomain();

        //no ID initially
        new Verifications(){{
            assertEquals(null, testUserDomain.getId());
        }};

        //When ID has a value
        testUserDomain.setId(4);

        new Varifications(){{
            assertEquals(4, testUserDomain.getId());
        }};
    }

    @Test
    public void testEmail(){

        //No email initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            assertEquals(null, testUserDomain.getEmail());
        }};

        //When Email has a value
        testUserDomain.setEmail("random@gmail.com");

        new Verifications(){{
            assertEquals("random@gmail.com", testUserDomain.getEmail());
        }};
    }

    @Test
    public void testPassword(){
        //no Password initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            asertEquals(null, testUserDomain.getPassword());
        }};

        //When Password has a value
        testUserDomain.setPassword("Hello");

        new Verifications(){{
            assertEquals("Hello", testUserDomain.getPassword());
        }};
    }

    @Test
    public void testUserName(){
        //no username initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            assertEquals(null, testUserDomain.getUserName());
        }};

        //When username has a value
        testUserDomain.setUserName("mkin20");

        new Verifications(){{
            assertEquals("mkin20", testUserDomain.getUserName());
        }};
    }

    @Test
    public void testFirstName(){
        //no Firstname initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            assertEquals(null, testUserDomain.getFirstName());
        }};

        //When firstName has a value
        testUserDomain.setFirstName("Matt");

        new Verifications(){{
            assertEquals("Matt", testUserDomain.getFirstname());
        }};
    }

    @Test
    public void testLastName(){
        //no Lastname initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            assertEquals(null, testUserDomain.getLastName());
        }};

        //When lastName has a value
        testUserDomain.setLastName("Matt");

        new Verifications(){{
            assertEquals("Matt", testUserDomain.getLastname());
        }};
    }

    //
    @Test
    public void testRestaurantDomain(){
        //no restaurantDomain initially
        testUserDomain = new UserDomain();

        new Verifications(){{
            assertEquals(null, testUserDomain.getRestaurantDomain());
        }};

        //When restaurantDomain has a value
        //
        //
        testUserDomain.setFirstName("Matt");

        new Verifications(){{
            assertEquals("Matt", testUserDomain.getFirstname());
        }};
    }
    //

}