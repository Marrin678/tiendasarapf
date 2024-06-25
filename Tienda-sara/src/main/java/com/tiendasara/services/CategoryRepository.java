package com.tiendasara.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiendasara.Tienda.sara.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
