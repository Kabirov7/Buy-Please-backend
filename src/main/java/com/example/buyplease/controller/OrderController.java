package com.example.buyplease.controller;

import com.example.buyplease.dto.OrderDto;
import com.example.buyplease.mappers.OrderMapper;
import com.example.buyplease.model.Customer;
import com.example.buyplease.model.Order;
import com.example.buyplease.model.Product;
import com.example.buyplease.service.CustomerService;
import com.example.buyplease.service.OrderService;
import com.example.buyplease.service.ProductService;
import com.example.buyplease.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api/v1/orders/")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

//    Todo: user have to be automate detected
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<OrderDto> createOrder(@RequestBody @Valid Order order){
        Product product = productService.getById(order.getProduct().getId());
        Customer customer = customerService.getById(order.getCustomer().getId());
        double totalPrice = order.getQuantity() * product.getPrice();
        order.setProduct(product);
        order.setCustomer(customer);
        order.setTotalPrice(totalPrice);

        this.orderService.save(order);
        return new ResponseEntity<>(OrderMapper.INSTANCE.toDto(order), HttpStatus.CREATED);

    }
}
