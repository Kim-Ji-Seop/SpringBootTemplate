package com.example.demo.src.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostOrderFromBasketRes {
    private int basketId;
    private Long buyId;
    private String request;
}
