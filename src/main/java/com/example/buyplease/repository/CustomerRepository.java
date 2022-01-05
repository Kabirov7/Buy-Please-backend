package com.example.buyplease.repository;

import com.example.buyplease.model.Customer;
import com.example.buyplease.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public List<Customer> findCustomersByPointsBetween(double point, double biggerPoint);

}
