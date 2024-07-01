package com.sourav.productservicejune2024.Services;

import com.sourav.productservicejune2024.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreProductService implements ProductService{

    @Override
    public Product getSingleProduct(Long productId) {
        return new Product();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
