package com.ecommerce_ian.sb_ecom_ian.service;

import com.ecommerce_ian.sb_ecom_ian.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
