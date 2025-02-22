package uk.lset.inventory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uk.lset.inventory.entities.Product;
import uk.lset.inventory.repository.ProductRepository;
import uk.lset.inventory.request.ProductRequest;
import uk.lset.inventory.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product getForId(@PathVariable("id") String id) {
		return productService.getProductById(id);
	}
	
	@PostMapping(path = "/product/create", consumes = "application/json", produces = "application/json")
	public Product createProduct(@RequestBody ProductRequest productRequest) {
		Product product = new Product();
		product.setProductDescription(productRequest.getProductDescription());
		product.setProductPlu(productRequest.getProductPlu());
		product.setBarCode(productRequest.getBarCode());
		product.setExpireDate(productRequest.getExpireDate());
		product.setPackingWeightKg(productRequest.getPackingWeightKg());
		product.setPackingHeightCm(productRequest.getPackingHeightCm());
		product.setPackingWidthCm(productRequest.getPackingWidthCm());
		product.setPackingDepthCm(productRequest.getPackingDepthCm());
		product.setProductQuantity(productRequest.getProductQuantity());
		product.setFrozen(productRequest.isFrozen());
		
		
		return productService.saveProduct(product);
	}
	
	@GetMapping(path = "product/all")
	public @ResponseBody Iterable<Product> getAllProducts(){
		Product product = null;
		return productService.getAllProducts(product);
	}
	
	
	@DeleteMapping("/product/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable String id){
		try {
			productService.deleteProduct(id);
			return ResponseEntity.ok("Product Delete Succesfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting product");
		} 
	}
}

