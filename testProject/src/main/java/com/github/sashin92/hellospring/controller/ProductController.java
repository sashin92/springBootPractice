package com.github.sashin92.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sashin92.hellospring.data.dto.ProductDTO;
import com.github.sashin92.hellospring.service.ProductService;



@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {
		
	private ProductService productService;
		
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/product")
	public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
		
		String productId = productDTO.getProductId();
		String productName = productDTO.getProductName();
		int productPrice = productDTO.getProductPrice();
		int productStock = productDTO.getProductStock();
		
		
		return productService.saveProduct(productId, productName, productPrice, productStock);
	}
	
	@GetMapping("/product/{productId}")
	public ProductDTO getProduct(@PathVariable String productId) {
		return productService.getProduct(productId);
	}
	
	@DeleteMapping("/product/{productId}")
	public ProductDTO deleteProduct(@PathVariable String productId) {
		return null;
	}

}
