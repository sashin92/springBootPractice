package com.github.sashin92.hellospring.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.sashin92.hellospring.data.dao.ProductDAO;
import com.github.sashin92.hellospring.data.entity.ProductEntity;
import com.github.sashin92.hellospring.handler.ProductDataHandler;


@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

	private ProductDAO productDAO;
	
	@Autowired
	public ProductDataHandlerImpl(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock) {
		ProductEntity productEntity = new ProductEntity(productId, productName, productPrice, productStock);
		return productDAO.saveProduct(productEntity);
	}

	@Override
	public ProductEntity getProductEntity(String productId) {
		return productDAO.getProductEntity(productId);
	}

	
}
