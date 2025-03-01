package com.ecommerce_ian.sb_ecom_ian.service;

import com.ecommerce_ian.sb_ecom_ian.model.Category;
import com.ecommerce_ian.sb_ecom_ian.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements  CategoryService{

    // private List<Category> categories = new ArrayList<>();
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        categoryRepository.delete(category);
        return "Category with categoryId: " + categoryId + " deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> savedCategoryOptional = categoryRepository.findById(categoryId);
        savedCategoryOptional
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Found"));
        Category savedCategory;
        category.setCategoryId(categoryId);
        savedCategory = categoryRepository.save(category);
        return savedCategory;

    }
}
