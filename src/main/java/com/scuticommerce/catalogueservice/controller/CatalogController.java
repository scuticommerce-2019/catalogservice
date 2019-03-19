package com.scuticommerce.catalogueservice.controller;


import com.scuticommerce.catalogueservice.service.CategoryService;
import com.scuticommerce.model.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping(value="/api/catalog/")
public class CatalogController {

    Logger logger = LogManager.getRootLogger();

    @Autowired
    CategoryService service;

    @GetMapping(value="/status")
    public ResponseEntity<?> up(){

        return new ResponseEntity<>("service is up", HttpStatus.OK);
    }

    @GetMapping(value="/all")
    public ResponseEntity<?> findAll(){

        return new ResponseEntity<>( service.findAll(), HttpStatus.OK);
    }

    @PostMapping(value="/add")
    public ResponseEntity<?> addCategory(@RequestBody Category category){

        logger.debug("Add category ");

        service.addCategory(category);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value="/delete")
    public ResponseEntity<?> delete(@RequestParam String id){

        logger.debug("Remove category " + id);

        service.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
