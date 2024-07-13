package com.sourav.productservicejune2024.Models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends Basemodel{
    private String name;
    private String description;

}
