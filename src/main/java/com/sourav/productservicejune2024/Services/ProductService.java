package com.sourav.productservicejune2024.Services;

import com.sourav.productservicejune2024.Models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

}
