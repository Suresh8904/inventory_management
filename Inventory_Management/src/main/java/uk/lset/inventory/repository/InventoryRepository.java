package uk.lset.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.lset.inventory.entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {

}
