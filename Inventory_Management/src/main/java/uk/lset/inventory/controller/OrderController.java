package uk.lset.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.inventory.entities.Order;
import uk.lset.inventory.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	@GetMapping("/order/{id}")
	public Order getForId(@PathVariable("id") String id) {
		return orderService.getOrderById(id);
	}
	
	
}
