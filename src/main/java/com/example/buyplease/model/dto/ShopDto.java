package com.example.buyplease.model.dto;

import java.io.Serializable;

public class ShopDto implements Serializable {
    Long id;
    String name;
    String description;
    UserDto userDto;

    public ShopDto() {
    }

    public ShopDto(Long id, String name, String description, UserDto userDto) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.userDto = userDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
