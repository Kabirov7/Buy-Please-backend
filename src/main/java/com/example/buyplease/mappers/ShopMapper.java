package com.example.buyplease.mappers;

import com.example.buyplease.model.Shop;
import com.example.buyplease.model.dto.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class})
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    @Mapping(source = "shop.employee", target = "userDto")
    ShopDto toDto(Shop shop);
}
