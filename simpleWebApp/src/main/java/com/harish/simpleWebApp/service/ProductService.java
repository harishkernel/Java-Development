package com.harish.simpleWebApp.service;

import com.harish.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Cannon", 70000),
            new Product(103, "Shure Mic", 10000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().
                filter(p -> p.getProdId() == prodId).
                findFirst().orElse(new Product(100, "Not Item Found", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int idx = 0;
        for(int i = 0; i < products.size(); i++) {
            if(product.getProdId() == products.get(i).getProdId()) {
                idx = i;
                break;
            }
        }
        products.set(idx, product);
    }

    public void deleteProduct(int id) {
        int idx = 0;
        for(int i = 0; i < products.size(); i++) {
            if(id == products.get(i).getProdId()) {
                idx = i;
                break;
            }
        }
        products.remove(idx);
    }
}
