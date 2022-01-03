package com.example.buyplease.mappers;

import com.example.buyplease.model.Order;
import com.example.buyplease.model.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ShopMapper.class, UserMapper.class, ProductMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "order.customer", target = "customerDto")
    @Mapping(source = "order.product", target = "productDto")
    @Mapping(source = "order.shop", target = "shopDto")
    OrderDto toDto(Order order);
}
