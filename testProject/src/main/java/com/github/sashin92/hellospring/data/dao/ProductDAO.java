package com.github.sashin92.hellospring.data.dao;

import com.github.sashin92.hellospring.data.entity.ProductEntity;

public interface ProductDAO {
	public ProductEntity saveProduct(ProductEntity productEntity);
	public ProductEntity getProductEntity(String productId);
}
