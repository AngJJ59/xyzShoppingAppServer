package com.xyz.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xyz.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
    
}
