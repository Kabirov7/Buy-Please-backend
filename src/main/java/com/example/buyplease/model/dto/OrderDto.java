package com.example.buyplease.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderDto {
    Long id;
    UserDto customerDto;
    ProductDto productDto;
    ShopDto shopDto;
    Long quantity;
    Long totalPrice;

    public OrderDto() {}

    public OrderDto(Long id, UserDto customerDto, ProductDto productDto, ShopDto shopDto, Long quantity, Long totalPrice) {
        this.id = id;
        this.customerDto = customerDto;
        this.productDto = productDto;
        this.shopDto = shopDto;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(UserDto customerDto) {
        this.customerDto = customerDto;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public ShopDto getShopDto() {
        return shopDto;
    }

    public void setShopDto(ShopDto shopDto) {
        this.shopDto = shopDto;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
