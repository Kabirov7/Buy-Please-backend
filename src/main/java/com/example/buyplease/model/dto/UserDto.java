package com.example.buyplease.model.dto;

import org.modelmapper.ModelMapper;

import java.io.Serializable;

public class UserDto implements Serializable {
    long id;
    String name;
//    String description;

    public UserDto() {
    }

    public UserDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
