package com.example.buyplease.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    Shop shop;

    @Column(name = "quantity")
    Long quantity;

    @Column(name = "total_price")
    Long totalPrice;

//    TODO: is customer paid order or not.


    public Order(Customer customer, Product product, Shop shop, Long quantity, Long totalPrice) {
        this.customer = customer;
        this.product = product;
        this.shop = shop;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Order() {

    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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
