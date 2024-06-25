package com.tiendasara.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiendasara.Tienda.sara.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
