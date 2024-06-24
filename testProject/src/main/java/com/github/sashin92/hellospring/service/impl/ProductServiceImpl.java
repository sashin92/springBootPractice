package com.github.sashin92.hellospring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sashin92.hellospring.data.dto.ProductDTO;
import com.github.sashin92.hellospring.data.entity.ProductEntity;
import com.github.sashin92.hellospring.handler.ProductDataHandler;
import com.github.sashin92.hellospring.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductDataHandler productDataHandler;
			
	@Autowired
	public ProductServiceImpl(ProductDataHandler productDataHandler) {
		this.productDataHandler = productDataHandler;
	}

	@Override
	public ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock) {
		ProductEntity productEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock);
		
		ProductDTO productDTO = new ProductDTO(productEntity.getProductId(),
									productEntity.getProductName(),
									productEntity.getProductPrice(),
									productEntity.getProductStock());
		return productDTO;
		
	}

	@Override
	public ProductDTO getProduct(String productId) {
		ProductEntity productEntity = productDataHandler.getProductEntity(productId);
		
		ProductDTO productDTO = new ProductDTO(productEntity.getProductId(), 
									productEntity.getProductName(), 
									productEntity.getProductPrice(), 
									productEntity.getProductStock());
		return productDTO;
	}
}
