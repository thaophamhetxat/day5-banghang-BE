package banhang.web.service;

import banhang.web.model.Category;
import banhang.web.repository.ICategoryRepo;
import banhang.web.service.impl.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepo iCategoryRepo;

    @Override
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public Category updateCategory(Category category) {
        return null;
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Category> getCategoryByAll(Long id) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
