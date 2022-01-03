package com.example.buyplease.model.dto;

public class ProductDto {
    Long id;
    ShopDto shopDto;
    String name;
    String description;
    String type;
    String subtype;
    double price;
    int quantityInStock;
    int quantitySold;
    String manufacturer;

    public ProductDto() {
    }

    public ProductDto(Long id, ShopDto shopDto, String name, String description, String type, String subtype, double price, int quantityInStock, int quantitySold, String manufacturer) {
        this.id = id;
        this.shopDto = shopDto;
        this.name = name;
        this.description = description;
        this.type = type;
        this.subtype = subtype;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.quantitySold = quantitySold;
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShopDto getShopDto() {
        return shopDto;
    }

    public void setShopDto(ShopDto shopDto) {
        this.shopDto = shopDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
