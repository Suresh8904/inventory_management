package uk.lset.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.inventory.entities.Order;
import uk.lset.inventory.request.OrderRequest;
import uk.lset.inventory.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	@GetMapping("/order/{id}")
	public Order getForId(@PathVariable("id") String id) {
		return orderService.getOrderById(id);
	}
	
	@PostMapping(path = "order/create", consumes = "application/json", produces = "application/json")
	public Order createOrder(@RequestBody OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrderDate(orderRequest.getOrderDate());
		order.setOrderSupplier(orderRequest.getOrderSupplier());
		order.setOrderProduct(orderRequest.getOrderProduct());
		order.setExpectedDate(orderRequest.getExpectedDate());
		order.setActualDate(orderRequest.getActualDate());
		order.setCompletedOrder(orderRequest.isCompletedOrder());
		
		return orderService.saveOrder(order);
		
	}
}
