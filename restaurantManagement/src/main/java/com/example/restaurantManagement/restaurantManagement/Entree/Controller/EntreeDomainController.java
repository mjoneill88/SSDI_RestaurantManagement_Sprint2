package com.example.restaurantManagement.restaurantManagement.Entree.Controller;

import com.example.restaurantManagement.restaurantManagement.Entree.Domain.EntreeDomain;
import com.example.restaurantManagement.restaurantManagement.Entree.Repository.EntreeDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class EntreeDomainController {
    @Autowired
    private EntreeDomainRepository entreeDomainRepository;

    @PostMapping(value = "/createEntree")
    public ResponseEntity.BodyBuilder createEntree(@RequestBody EntreeDomain entreeDomain){

        entreeDomainRepository.save(entreeDomain);

        return ResponseEntity.ok();
    }

    @GetMapping(value = "/createEntree")
    public ArrayList<EntreeDomain> getAllEntrees(){
        ArrayList<EntreeDomain> entreeDomains = new ArrayList<>();
        for (EntreeDomain entreeDomain: entreeDomainRepository.findAll()){
            entreeDomains.add(entreeDomain);
        }
        return entreeDomains;
    }

    @PutMapping(value = "/createEntree")
    public void updateEntree(@RequestBody EntreeDomain entreeDomain){
        entreeDomainRepository.save(entreeDomain);
    }

    @DeleteMapping(value = "/createEntree")
    public void deleteEntree(@RequestBody EntreeDomain entreeDomain){
        entreeDomainRepository.delete(entreeDomain);
    }







}
