package com.example.restaurantManagement.restaurantManagement.Inventory.Domain;

import com.example.restaurantManagement.restaurantManagement.Recipe.Domain.RecipeDomain;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class InventoryDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    Integer quantity;
    Integer threshold;
    String firstName;
    String lastName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "recipe_id")
    private RecipeDomain recipeDomain;



    public InventoryDomain(Integer id, Integer quantity, Integer threshold, String firstName, String lastName){
        this.Id = id;
        this.quantity = quantity;
        this.threshold = threshold;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public InventoryDomain(){

    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}