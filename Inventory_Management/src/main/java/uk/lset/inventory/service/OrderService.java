package uk.lset.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.inventory.entities.Order;
import uk.lset.inventory.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order getOrderById(String id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

}
