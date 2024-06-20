package com.example.ordered.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Double vlTotal;
    private Long clienteId;
    private List<Product> products;
}
