package com.ksb.micro.product.service;

import ch.qos.logback.classic.Logger;
import com.ksb.micro.product.dto.ProductRequest;
import com.ksb.micro.product.model.Product;
import com.ksb.micro.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
/*@RequiredArgsConstructor*/
public class ProductService {
    private final ProductRepository productRepository;
    private Logger log;

    //constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductRequest productRequest){
        Product product = Product.builder().name(productRequest.name()).description(productRequest.description()).price(productRequest.price()).build();
        productRepository.save(product);
        log.info("Product created!!");
        return product;
    }
}
