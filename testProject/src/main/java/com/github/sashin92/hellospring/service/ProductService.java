package com.github.sashin92.hellospring.service;

import com.github.sashin92.hellospring.data.dto.ProductDTO;

public interface ProductService {
	ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);
	ProductDTO getProduct(String productId);
}
