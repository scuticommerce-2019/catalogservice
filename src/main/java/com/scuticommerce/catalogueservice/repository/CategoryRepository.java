package com.scuticommerce.catalogueservice.repository;


import com.scuticommerce.model.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category,String> {

    List<Category> findCategoryByLevel(Integer level);

}
