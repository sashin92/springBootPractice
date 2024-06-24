package com.github.sashin92.hellospring.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.sashin92.hellospring.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
