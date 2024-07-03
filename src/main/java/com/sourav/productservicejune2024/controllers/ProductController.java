package com.sourav.productservicejune2024.controllers;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.Services.FakeStoreProductService;
import com.sourav.productservicejune2024.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //  http://localhsot:8080/products/1
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);

    }
    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    public void   deleteProduct(){

    }

    //PATCH == http://localhost:8080/Product/1
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id")Long id, @RequestBody Product product){
        return null;
    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, Product product){
        return null;

    }
//    public addNewProduct(Product product){
//
//    }
}
