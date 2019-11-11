package com.example.restaurantManagement.restaurantManagement.Restaurant.Repository;


import com.example.restaurantManagement.restaurantManagement.Restaurant.Domain.RestaurantDomain;
import com.example.restaurantManagement.restaurantManagement.User.Domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantDomainRepository  extends JpaRepository<RestaurantDomain,Integer>{
}