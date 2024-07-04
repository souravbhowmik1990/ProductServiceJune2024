package com.sourav.productservicejune2024.Services;

import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product updateProduct(Long id, Product product);

    Product replaceProduct(Long id, Product product);

    void deleteProduct(Long id);

}
