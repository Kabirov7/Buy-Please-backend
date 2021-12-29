package com.example.buyplease.service;

import com.example.buyplease.model.Shop;
import com.example.buyplease.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImplementation implements ShopService{
    @Autowired
    ShopRepository shopRepository;

    @Override
    public Shop getById(Long id) {
        return shopRepository.getById(id);
    }

    @Override
    public void save(Shop shop) {
        shopRepository.save(shop);
    }

    @Override
    public void delete(Long id) {
        shopRepository.deleteById(id);
    }

    @Override
    public List<Shop> getAll() {
        return shopRepository.findAll();
    }
}
