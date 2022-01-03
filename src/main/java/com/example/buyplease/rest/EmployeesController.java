package com.example.buyplease.rest;

import com.example.buyplease.mappers.UserMapper;
import com.example.buyplease.model.Customer;
import com.example.buyplease.model.Employee;
import com.example.buyplease.model.User;
import com.example.buyplease.model.dto.UserDto;
import com.example.buyplease.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee){
        this.employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getEmployee(@PathVariable("id") Long id){
        return new ResponseEntity<>(UserMapper.INSTANCE.toDto(employeeService.getById(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<UserDto> allEmployees(){
        List<Employee> employees = employeeService.getAll();
        return new ResponseEntity(employees.stream().map(s -> UserMapper.INSTANCE.toDto(s)), HttpStatus.OK);
    }
}
