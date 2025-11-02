package com.zonama.backend.utility;

import com.zonama.backend.dto.ProductDTO;
import com.zonama.backend.entity.Product;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductMapper {
    public ProductDTO toDTO(Product product){
        ProductDTO productDTO=new ProductDTO();
        productDTO.setProductId(product.getProductId());
        productDTO.setName(product.getName());
        productDTO.setBrand(product.getBrand());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategory(product.getCategory());
        productDTO.setDescription(product.getDescription());
        productDTO.setAvailableQuantity(product.getAvailableQuantity());
        return productDTO;
    }
}
