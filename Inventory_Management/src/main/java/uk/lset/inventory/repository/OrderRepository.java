package uk.lset.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.lset.inventory.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
