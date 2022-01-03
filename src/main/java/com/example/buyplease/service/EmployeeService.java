package com.example.buyplease.service;

import com.example.buyplease.model.Employee;
import com.example.buyplease.model.User;

import java.util.List;

public interface EmployeeService {
    Employee getById(Long id);

    void save(Employee employee);

    void delete(long id);

    List<Employee> getAll();

}
