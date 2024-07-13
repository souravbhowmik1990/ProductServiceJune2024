package com.sourav.productservicejune2024.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Product extends Basemodel {
    private String title;
    private double price;
    @ManyToOne
    private Category category;


}
