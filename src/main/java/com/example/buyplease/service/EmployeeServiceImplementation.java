package com.example.buyplease.service;

import com.example.buyplease.model.Employee;
import com.example.buyplease.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImplementation implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getById(Long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
