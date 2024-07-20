package com.sourav.productservicejune2024.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Product extends Basemodel {
    private String title;
    private Double price;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn
    private Category category;


}
