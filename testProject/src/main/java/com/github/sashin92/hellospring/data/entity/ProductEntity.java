package com.github.sashin92.hellospring.data.entity;

import com.github.sashin92.hellospring.data.dto.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {
	@Id
	private String productId;
	
	private String productName;
	
	private Integer productPrice;
	
	private Integer productStock;
	
	
	
	
	public ProductDTO toDto() {
		return ProductDTO.builder()
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productStock(productStock)
				.build();
	}
	

}
