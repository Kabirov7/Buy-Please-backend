package com.example.buyplease.controller;

import com.example.buyplease.mappers.ProductMapper;
import com.example.buyplease.model.Product;
import com.example.buyplease.model.Shop;
import com.example.buyplease.dto.ProductDto;
import com.example.buyplease.service.ProductService;
import com.example.buyplease.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/products/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<ProductDto> createProduct(@RequestBody @Valid Product product){
        this.productService.save(product);
        Shop shop = shopService.getById(product.getShop().getId());
        product.setShop(shop);
        return new ResponseEntity<>(ProductMapper.INSTANCE.toDto(product), HttpStatus.CREATED);
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public ResponseEntity<ProductDto> getProduct(@PathVariable("id") Long id){
        return new ResponseEntity<>(ProductMapper.INSTANCE.toDto(productService.getById(id)), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<ProductDto> allProducts(){
        List<Product> products = productService.getAll();
        return new ResponseEntity(products.stream().map(s -> ProductMapper.INSTANCE.toDto(s)), HttpStatus.OK);
    }
}
