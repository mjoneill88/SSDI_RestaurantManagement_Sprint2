package com.example.restaurantManagement.restaurantManagement.User.Controller;

import com.example.restaurantManagement.restaurantManagement.User.Domain.UserDomain;
import com.example.restaurantManagement.restaurantManagement.User.Repository.UserDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserDomainController {
    @Autowired
    private UserDomainRepository userDomainRepository;

    @PostMapping(value = "/createUser")
    public ResponseEntity.BodyBuilder createUser(@RequestBody UserDomain userDomain){
        userDomainRepository.save(userDomain);

        return ResponseEntity.ok();
    }


    @GetMapping(value = "/createUser")
    public ArrayList<UserDomain> getAllUsers(){
        ArrayList<UserDomain> userDomains = new ArrayList<>();
        for(UserDomain userDomain: userDomainRepository.findAll()){
            userDomains.add(userDomain);
        }
        return userDomains;
    }

    @PutMapping(value ="/createUser")
    public void updateUser(@RequestBody UserDomain userDomain){
        userDomainRepository.save(userDomain);
    }

    @DeleteMapping(value = "/createUser")
    public void deleteUser(@RequestParam Integer id){
        userDomainRepository.deleteById(id);
    }


    @GetMapping(value = "/login")
    public boolean login(@RequestParam String userName, String passWord){
        if(passWord.equals(userDomainRepository.GetPassword(userName))) return true;
        return false;
    }
}
