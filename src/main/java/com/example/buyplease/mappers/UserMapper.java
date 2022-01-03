package com.example.buyplease.mappers;

import com.example.buyplease.model.User;
import com.example.buyplease.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto toDto(User user);
}
