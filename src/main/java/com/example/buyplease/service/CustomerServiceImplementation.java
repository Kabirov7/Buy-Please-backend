package com.example.buyplease.service;

import com.example.buyplease.model.User;
import com.example.buyplease.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public User getById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public void save(User user) {
        customerRepository.save(user);
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return customerRepository.findAll();
    }
}
