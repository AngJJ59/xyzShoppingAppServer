package com.xyz.productservice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.xyz.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, ObjectId> {
    
}
