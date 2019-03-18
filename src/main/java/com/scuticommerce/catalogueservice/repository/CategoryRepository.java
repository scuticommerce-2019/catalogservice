package com.scuticommerce.catalogueservice.repository;


import com.scuticommerce.model.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category,String> {
}
