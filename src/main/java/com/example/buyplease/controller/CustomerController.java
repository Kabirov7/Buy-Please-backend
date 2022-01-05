package com.example.buyplease.controller;

import com.example.buyplease.mappers.UserMapper;
import com.example.buyplease.model.Customer;
import com.example.buyplease.dto.UserDto;
import com.example.buyplease.service.CustomerService;
import com.google.api.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/customers/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Customer> createUser(@RequestBody @Valid Customer customer){
        this.customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

//    @PreAuthorize()
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id, @AuthenticationPrincipal Authentication authentication){
        return new ResponseEntity<>(UserMapper.INSTANCE.toDto(customerService.getById(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<UserDto> allUsers(){
        List<Customer> customers = customerService.getAll();
        return new ResponseEntity(customers.stream().map(s -> UserMapper.INSTANCE.toDto(s)), HttpStatus.OK);
    }
}
