package uk.lset.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.inventory.entities.Supplier;
import uk.lset.inventory.request.SuppleirRequest;
import uk.lset.inventory.service.SupplierService;

@RestController
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping("/supplier/{id}")
	public Supplier getforId(@PathVariable("id") String id) {
		return supplierService.getSupplierById(id);
	}
	
	@PostMapping(path = "/supplier/create", consumes = "application/json", produces = "application/json" )
	public Supplier createSupplier(@RequestBody SuppleirRequest supplierRequest) {
		Supplier supplier = new Supplier();
		supplier.setSupplierName(supplierRequest.getSupplierName());
		supplier.setSupplierRegNr(supplierRequest.getSupplierRegNr());
		supplier.setSupplierAddress(supplierRequest.getSupplierAddress());
		return supplierService.saveSupplier(supplier);
	}
}
