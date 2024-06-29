package com.sourav.productservicejune2024;

import com.sourav.productservicejune2024.Models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceJune2024Application {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceJune2024Application.class, args);

        Product product = new Product();
        product.setTitle("IPhone 15 pro");
    }

}
