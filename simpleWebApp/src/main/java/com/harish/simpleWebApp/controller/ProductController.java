package com.harish.simpleWebApp.controller;

import com.harish.simpleWebApp.model.Product;
import com.harish.simpleWebApp.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    // constructor injection is preferred

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String getProducts() {
        return productService.getProducts().toString();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping()
    public void addProduct(@RequestBody Product product) {
        System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping()
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
