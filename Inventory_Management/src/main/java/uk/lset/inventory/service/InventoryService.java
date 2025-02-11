package uk.lset.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.inventory.entities.Inventory;
import uk.lset.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	public Inventory getInventoryById(String id) {
		return inventoryRepository.findById(id).orElse(null);
	}
	
	public Inventory saveAddress(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}
}
