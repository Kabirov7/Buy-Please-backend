package com.example.buyplease.dto;


import java.io.Serializable;

public class OrderDto implements Serializable {
    Long id;
    UserDto customerDto;
    ProductDto productDto;
    Long quantity;
    Long totalPrice;

    public OrderDto() {}

    public OrderDto(Long id, UserDto customerDto, ProductDto productDto, Long quantity, Long totalPrice) {
        this.id = id;
        this.customerDto = customerDto;
        this.productDto = productDto;
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
