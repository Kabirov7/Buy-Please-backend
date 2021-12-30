package com.example.buyplease.mappers;

import com.example.buyplease.model.Shop;
import com.example.buyplease.model.ShopDto;
import com.example.buyplease.model.User;
import com.example.buyplease.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class})
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    @Mapping(source = "shop.user", target = "userDto")
    ShopDto toDto(Shop shop);
}
