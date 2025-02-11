package uk.lset.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.lset.inventory.entities.Supplier;
import uk.lset.inventory.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;
	
	public  Supplier getSupplierById(String id ) {
		return supplierRepository.findById(id).orElse(null);
	}
	
	public Supplier saveSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}
}
