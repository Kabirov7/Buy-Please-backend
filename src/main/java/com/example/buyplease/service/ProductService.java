package com.example.buyplease.service;

import com.example.buyplease.model.Product;
import java.util.List;

public interface ProductService {
    Product getById(Long id);

    void save(Product product);

    void delete(Long id);

    List<Product> getAll();
}
