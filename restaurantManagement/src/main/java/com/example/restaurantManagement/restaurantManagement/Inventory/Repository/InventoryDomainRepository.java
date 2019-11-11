package com.example.restaurantManagement.restaurantManagement.Inventory.Repository;

import com.example.restaurantManagement.restaurantManagement.Inventory.Domain.InventoryDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryDomainRepository extends JpaRepository<InventoryDomain,Integer> {

}
