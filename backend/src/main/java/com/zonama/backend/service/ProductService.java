package com.zonama.backend.service;

import com.zonama.backend.dto.ProductDTO;
import com.zonama.backend.utility.ProductMapper;
import com.zonama.backend.entity.Product;
import com.zonama.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public Page<ProductDTO> getProducts(int page, int size){
        Pageable pageable= PageRequest.of(page, size);
        Page<Product> products=productRepository.findAll(pageable);
        return products.map(productMapper::toDTO);
    }
}
