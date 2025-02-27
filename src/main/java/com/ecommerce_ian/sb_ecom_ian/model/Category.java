package com.ecommerce_ian.sb_ecom_ian.model;

public class Category {
    private static long idCounter = 1;
    private Long categoryId;
    private String categoryName;

    public Category(Long categoryId, String categoryName) {
        this.categoryId = idCounter++;
        this.categoryName = categoryName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
