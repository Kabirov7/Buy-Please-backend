package com.example.buyplease.service;

import com.example.buyplease.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Long id);

    void save(Customer customer);

    void delete(long id);

    List<Customer> getAll();
}
