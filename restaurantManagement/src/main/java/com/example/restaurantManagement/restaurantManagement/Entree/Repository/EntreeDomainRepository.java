package com.example.restaurantManagement.restaurantManagement.Entree.Repository;

import com.example.restaurantManagement.restaurantManagement.Entree.Domain.EntreeDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreeDomainRepository extends JpaRepository<EntreeDomain, Integer> {
    /*    @Query(value = "SELECT password FROM rManagement.user_domain where user_name=:userName",nativeQuery = true)
    String GetPassword(@RequestParam String userName);
*/

}
