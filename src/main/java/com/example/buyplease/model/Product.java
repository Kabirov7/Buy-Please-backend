package com.example.buyplease.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Shop shop;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "type")
    String type;

    @Column(name = "subtype")
    String subtype;

    @Column(name = "price")
    double price;

    @Column(name = "quantity_in_stock")
    int quantityInStock;

    @Column(name = "quantity_sold")
    int quantitySold;

    @Column(name = "manufacturer")
    String manufacturer;

    public Product() {}

    public Product(Shop shop, String name, String description, String type, String subtype, double price, int quantityInStock, int quantitySold, String manufacturer) {
        this.shop = shop;
        this.name = name;
        this.description = description;
        this.type = type;
        this.subtype = subtype;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.quantitySold = quantitySold;
        this.manufacturer = manufacturer;
    }


    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop_id) {
        this.shop = shop_id;
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
