package com.example.buyplease.mappers;

import com.example.buyplease.model.User;
import com.example.buyplease.model.UserDto;

public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if (user == null) {
            return null;
        }

        var userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
}
