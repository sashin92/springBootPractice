package com.github.sashin92.hellospring.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sashin92.hellospring.data.dao.ProductDAO;
import com.github.sashin92.hellospring.data.entity.ProductEntity;
import com.github.sashin92.hellospring.data.repository.ProductRepository;


@Service
public class ProductDAOImpl implements ProductDAO {

	private ProductRepository productRepository;
	
	@Autowired
	public ProductDAOImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		return productEntity;
	}

	@Override
	public ProductEntity getProductEntity(String productId) {
		ProductEntity productEntity = productRepository.getById(productId);
		return productEntity;
	}
	
	
}
