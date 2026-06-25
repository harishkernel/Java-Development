package com.harish.simpleWebApp.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int prodId;
    private String prodName;
    private int price;

}