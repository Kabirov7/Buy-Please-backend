package com.example.buyplease.mappers;

import com.example.buyplease.model.Product;
import com.example.buyplease.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ShopMapper.class})
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source="product.shop", target="shopDto")
    ProductDto toDto(Product product);
}
