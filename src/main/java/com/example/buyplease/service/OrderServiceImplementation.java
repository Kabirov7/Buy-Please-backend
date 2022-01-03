package com.example.buyplease.service;

import com.example.buyplease.model.Order;
import com.example.buyplease.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order getById(Long id) {
        return orderRepository.getById(id);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
