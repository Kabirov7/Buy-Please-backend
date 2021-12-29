package com.example.buyplease.mappers;

import com.example.buyplease.model.Shop;
import com.example.buyplease.model.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);
    ShopDto toDto(Shop shop);
}
