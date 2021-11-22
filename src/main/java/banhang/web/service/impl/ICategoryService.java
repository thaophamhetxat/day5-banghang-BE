package banhang.web.service.impl;

import banhang.web.model.Category;

import java.util.Optional;

public interface ICategoryService {
    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public Optional<Category> getCategoryById(Long id);

    public Iterable<Category> getCategoryByAll(Long id);

    public void deleteCategory(Long id);
}
