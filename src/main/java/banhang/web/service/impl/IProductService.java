package banhang.web.service.impl;

import banhang.web.model.Product;

import java.util.Optional;

public interface IProductService {
    public Product addProduct(Product product);

    public Product updateProduct(Product product);

    public Optional<Product> getProductById(Long id);

    public Iterable<Product> getProductByAll();

    public void deleteProduct(Long id);

//    public ArrayList<Product> findAllByTitle(String name);
}
