package com.example.buyplease.service;

import com.example.buyplease.model.Order;
import com.example.buyplease.model.Product;
import com.example.buyplease.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImplementation implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
