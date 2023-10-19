package com.peopleconnectapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> getAllCategory(){
       List<Category> categories =  categoryService.getAllCategory();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
