package com.example.restaurantManagement.restaurantManagement.Entree.Domain;

import com.example.restaurantManagement.restaurantManagement.Recipe.Domain.RecipeDomain;
import com.example.restaurantManagement.restaurantManagement.Restaurant.Domain.RestaurantDomain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Cascade;

@Entity
public class EntreeDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    Double price;


    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "restaurant_id")
    private RestaurantDomain restaurantDomain;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "recipe_id")
    private RecipeDomain recipeDomain;


    public EntreeDomain(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public EntreeDomain() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
