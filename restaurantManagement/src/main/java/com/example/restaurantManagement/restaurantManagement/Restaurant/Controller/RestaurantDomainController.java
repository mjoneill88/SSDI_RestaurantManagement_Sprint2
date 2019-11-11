package com.example.restaurantManagement.restaurantManagement.Restaurant.Controller;


import com.example.restaurantManagement.restaurantManagement.Restaurant.Domain.RestaurantDomain;
import com.example.restaurantManagement.restaurantManagement.Restaurant.Repository.RestaurantDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class RestaurantDomainController {

    @Autowired
    private RestaurantDomainRepository restaurantDomainRepository;


    @PostMapping(value = "/createRestaurant")
    public ResponseEntity.BodyBuilder createRestaurant(@RequestBody RestaurantDomain restaurantDomain){
        restaurantDomainRepository.save(restaurantDomain);

        return ResponseEntity.ok();
    }

    @GetMapping(value = "/createRestaurant")
    public ArrayList<RestaurantDomain> getAllRestaurants(){
        ArrayList<RestaurantDomain> restaurantDomains = new ArrayList<>();
        for(RestaurantDomain restaurantDomain: restaurantDomainRepository.findAll()){
            restaurantDomains.add(restaurantDomain);
        }
        return restaurantDomains;
    }

    @PutMapping(value = "/createRestaurant")
    public void updateRestaurant(@RequestBody RestaurantDomain restaurantDomain){restaurantDomainRepository.save(restaurantDomain);}

    @DeleteMapping(value = "/createRestaurant")
    public void deleteRestaurant(@RequestParam Integer id) {restaurantDomainRepository.deleteById(id);}


}










