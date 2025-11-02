package com.zonama.backend.dto;

import com.zonama.backend.enums.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer productId;
    private String name;
    private String description;
    private Category category;
    private String brand;
    private Double price;
    private Integer availableQuantity;
}
