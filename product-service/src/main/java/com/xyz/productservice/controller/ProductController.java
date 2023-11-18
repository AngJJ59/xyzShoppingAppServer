package com.xyz.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.productservice.dto.ProductRequest;
import com.xyz.productservice.model.Product;
import com.xyz.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("xyz/api/product")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest) ? new ResponseEntity<>(HttpStatus.CREATED):new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
    }
}
