package com.sourav.productservicejune2024.controllers;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.Services.FakeStoreProductService;
import com.sourav.productservicejune2024.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){

////        throw new RuntimeException("Something went wrong");
//        ResponseEntity<Product> responseEntity = null;
//
//        try{
//            Product product = productService.getSingleProduct(id);
//
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//        }catch(RuntimeException e){
//             responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        ResponseEntity<Product> response = new ResponseEntity<>(
                productService.getSingleProduct(id),
                HttpStatus.OK);
        return response;

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
        return productService.updateProduct(id, product);
    }
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, Product product){
        return null;
    }

//    @ExceptionHandler(ArithmeticException.class)
//    public ResponseEntity<String> handleArithmeticException(){
//        ResponseEntity<String> response = new ResponseEntity<>(
//                "Array index Out of Bounds Exception has happened Inside The Controller",
//                HttpStatus.NOT_FOUND);
//
//        return response;
//    }



//    public addNewProduct(Product product){
//
//    }
}
