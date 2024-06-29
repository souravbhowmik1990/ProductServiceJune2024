package com.sourav.productservicejune2024.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends Basemodel {
    private String title;
    private double price;
    private Category category;


}
