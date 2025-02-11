package uk.lset.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.inventory.entities.Inventory;
import uk.lset.inventory.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/inventory/{id}")
	
	public Inventory getForId(@PathVariable("id") String id) {
		return inventoryService.getInventoryById(id);
	}
}

