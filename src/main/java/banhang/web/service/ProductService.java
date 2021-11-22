package banhang.web.service;

import banhang.web.model.Product;
import banhang.web.repository.IProductRepo;
import banhang.web.service.impl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepo iProductRepo;

    @Override
    public Product addProduct(Product product) {
        return iProductRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return iProductRepo.save(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return iProductRepo.findById(id);
    }

    @Override
    public Iterable<Product> getProductByAll() {
        return iProductRepo.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        iProductRepo.findById(id);
    }
}
