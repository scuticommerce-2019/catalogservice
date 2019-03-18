package com.scuticommerce.catalogueservice.service;

import com.scuticommerce.catalogueservice.repository.CategoryRepository;
import com.scuticommerce.model.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void addCategory(Category category){

        categoryRepository.save(category);
    }

    public List<Category> findAll(){

        return categoryRepository.findAll();
    }

}
