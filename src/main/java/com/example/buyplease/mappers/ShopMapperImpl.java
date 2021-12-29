package com.example.buyplease.mappers;

import com.example.buyplease.model.Shop;
import com.example.buyplease.model.ShopDto;
import com.example.buyplease.model.UserDto;

public class ShopMapperImpl implements ShopMapper {
    @Override
    public ShopDto toDto(Shop shop) {
        if (shop == null){
            return null;
        }
        ShopDto shopDto = new ShopDto();
        UserMapperImpl userMapper = new UserMapperImpl();
        UserDto userDto = userMapper.toDto(shop.getUser());

        shopDto.setId(shop.getId());
        shopDto.setName(shop.getName());
        shopDto.setUserDto(userDto);

        return shopDto;
    }
}
