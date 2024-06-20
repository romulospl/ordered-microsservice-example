package com.example.ordered.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ordered.model.Order;
import com.example.ordered.model.Product;

@RequestMapping(path = "ordereds")
@RestController
public class OrderedController {

    @GetMapping
    public ResponseEntity<List<Order>> getOrdereds() {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Camiseta de algodão", 105.00));
        products.add(new Product(2L, "Camiseta de algodão", 105.00));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L, 210.0, 2L, products));
        return ResponseEntity.ok(orders);
    }
}
