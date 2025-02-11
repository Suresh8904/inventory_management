package uk.lset.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.lset.inventory.entities.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String>{

}
