package com.example.buyplease.service;

import com.example.buyplease.model.Order;
import com.example.buyplease.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
    Order getById(Long id);

    void save(Order order);

    void delete(Long id);

    List<Order> getAll();
}
