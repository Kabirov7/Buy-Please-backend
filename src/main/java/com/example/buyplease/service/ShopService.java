package com.example.buyplease.service;

import com.example.buyplease.model.Shop;

import java.util.List;

public interface ShopService {
    Shop getById(Long id);

    void save(Shop shop);

    void delete(Long id);

    List<Shop> getAll();
}
