package com.example.restaurantManagement.restaurantManagement.Inventory.Controller;

import com.example.restaurantManagement.restaurantManagement.Inventory.Domain.InventoryDomain;
import com.example.restaurantManagement.restaurantManagement.Inventory.Domain.InventoryDomain;
import com.example.restaurantManagement.restaurantManagement.Inventory.Repository.InventoryDomainRepository;
import jdk.jfr.internal.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InventoryDomainController{
    @Autowired
    private InventoryDomainRepository inventoryDomainRepository;

    @PostMapping(value = "/createInventory")
    public ResponseEntity.BodyBuilder createInventory(@RequestBody InventoryDomain inventoryDomain){
        inventoryDomainRepository.save(inventoryDomain);
        return ResponseEntity.ok();
    }

    @GetMapping(value = "/createInventory")
    public ArrayList<InventoryDomain> getAllInventories(){
        ArrayList<InventoryDomain> inventoryDomains = new ArrayList<>();
        for(InventoryDomain inventoryDomain : inventoryDomainRepository.findAll()){
            inventoryDomains.add(inventoryDomain);
        }
        return inventoryDomains;
    }

    @PutMapping(value ="/createInventory")
    public void updateInventory(@RequestBody InventoryDomain inventoryDomain){
        inventoryDomainRepository.save(inventoryDomain);
    }

    @DeleteMapping(value = "/deleteInventory")
    public void deleteInventory(@RequestParam Integer id){
        inventoryDomainRepository.deleteById(id);
    }
}