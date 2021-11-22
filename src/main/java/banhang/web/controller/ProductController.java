package banhang.web.controller;

import banhang.web.model.Product;
import banhang.web.service.impl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/kimkhi/sanpham")
public class ProductController {

    @Autowired
    private IProductService iProductService;


    @PostMapping
    public ResponseEntity<Product> add(@RequestBody Product product) {
        return ResponseEntity.ok(iProductService.addProduct(product));
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(iProductService.getProductByAll());
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return iProductService.getProductById(id).get();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
        Optional productOptional = Optional.ofNullable(iProductService.getProductById(id));
        if (!productOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(iProductService.updateProduct(product), HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        iProductService.deleteProduct(id);
    }

}
