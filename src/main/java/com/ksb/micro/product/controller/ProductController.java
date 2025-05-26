package com.ksb.micro.product.controller;

import com.ksb.micro.product.dto.ProductRequest;
import com.ksb.micro.product.model.Product;
import com.ksb.micro.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    //constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody ProductRequest productRequest){
    return productService.createProduct(productRequest);
    }
}
