package com.example.restaurantManagement.restaurantManagement.Restaurant.Domain;

import com.example.restaurantManagement.restaurantManagement.User.Domain.UserDomain;

import com.example.restaurantManagement.restaurantManagement.Entree.Domain.EntreeDomain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;

import java.util.HashSet;
import java.util.Set;

@Entity
public class RestaurantDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private UserDomain userDomain;


    @OneToMany(mappedBy = "restaurantDomain", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<EntreeDomain> EntreeDomain = new HashSet<>();



    public RestaurantDomain() {
    }

    public RestaurantDomain(Integer id, String name, String address, UserDomain userDomain) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.userDomain = userDomain;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserDomain getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(UserDomain userDomain) {
        this.userDomain = userDomain;
    }
}
