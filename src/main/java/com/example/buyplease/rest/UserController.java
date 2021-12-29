package com.example.buyplease.rest;

import com.example.buyplease.model.ShopDto;
import com.example.buyplease.model.User;
import com.example.buyplease.model.UserDto;
import com.example.buyplease.service.UserService;
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
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody @Valid User user){
        this.userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<UserDto> main(){
        List<User> users = userService.getAll();
        return new ResponseEntity(users.stream().map(s -> modelMapper.map(s, UserDto.class)), HttpStatus.OK);
    }
}
