package com.peopleconnectapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory(){
        Iterable<Category> categoryIterable = categoryRepository.findAll();
        List<Category> categories = new ArrayList<>();
        categoryIterable.forEach(categories::add);
        return categories;
    }


}
