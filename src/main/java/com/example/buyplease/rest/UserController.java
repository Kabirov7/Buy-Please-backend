package com.example.buyplease.rest;

import com.example.buyplease.mappers.UserMapper;
import com.example.buyplease.model.User;
import com.example.buyplease.model.dto.UserDto;
import com.example.buyplease.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/users/")
public class UserController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody @Valid User user){
        this.customerService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id){
        return new ResponseEntity<>(UserMapper.INSTANCE.toDto(customerService.getById(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<UserDto> allUsers(){
        List<User> users = customerService.getAll();
        return new ResponseEntity(users.stream().map(s -> UserMapper.INSTANCE.toDto(s)), HttpStatus.OK);
    }
}
