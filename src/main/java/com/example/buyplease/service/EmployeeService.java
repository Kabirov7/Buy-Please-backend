package com.example.buyplease.service;

import com.example.buyplease.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee getById(Long id);

    void save(Employee employee);

    void delete(long id);

    List<Employee> getAll();

}
