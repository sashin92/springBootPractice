package com.github.sashin92.hellospring.handler;

import com.github.sashin92.hellospring.data.entity.ProductEntity;

public interface ProductDataHandler {

	ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
	ProductEntity getProductEntity(String productId);
	
}
