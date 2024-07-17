package com.sourav.productservicejune2024.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class Basemodel {
    @Id //For Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    private Long id;
    private Date createdAt;
    private Date updatedAt;


}
