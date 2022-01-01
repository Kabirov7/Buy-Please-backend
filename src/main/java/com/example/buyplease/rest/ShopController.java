package com.example.buyplease.rest;

import com.example.buyplease.mappers.ShopMapper;
import com.example.buyplease.model.Shop;
import com.example.buyplease.model.ShopDto;
import com.example.buyplease.service.ShopService;
import com.example.buyplease.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/shops/")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Shop> createShop(@RequestBody @Valid Shop shop){
        this.shopService.save(shop);
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<ShopDto> getShop(@PathVariable("id") Long id){
        return new ResponseEntity<>(ShopMapper.INSTANCE.toDto(shopService.getById(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<ShopDto> allShops(){
        List<Shop> shops = shopService.getAll();
        return new ResponseEntity(shops.stream().map(s -> ShopMapper.INSTANCE.toDto(s)), HttpStatus.OK);
    }
}
