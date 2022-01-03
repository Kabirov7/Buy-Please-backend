package com.example.buyplease.service;

import com.example.buyplease.model.Employee;
import com.example.buyplease.model.Order;

import java.util.List;

public interface OrderService {
    Order getById(Long id);

    void save(Order order);

    void delete(long id);

    List<Order> getAll();
}
