package com.example.restaurantManagement.restaurantManagement.RestaurantTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
@SpringBootTest

public class RestaurantDomainTest {

    private RestaurantDomain testRestaurantDomain;

    @Test
    public void testRestaurantDomainWithParams(){

        testRestaurantDomain = new RestaurantDomain(3, "Burger King", "112 1st St.", );
    }
}