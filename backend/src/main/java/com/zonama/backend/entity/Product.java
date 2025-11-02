package com.zonama.backend.entity;

import com.zonama.backend.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String name;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private String brand;
    private Double price;
    private Integer availableQuantity;
}
