package com.xyz.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xyz.productservice.dto.ProductRequest;
import com.xyz.productservice.model.Product;
import com.xyz.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public boolean createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .productDescription(productRequest.getProductDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);

        log.info("Product" + product.getId() + "is saved");
        return true;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
        
    }
}
