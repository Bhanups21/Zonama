package com.zonama.backend.controller;

import com.zonama.backend.dto.ProductDTO;
import com.zonama.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Page<ProductDTO> fetchAllProducts(@RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "10") int size){
        return productService.getProducts(page,size);
    }
}
