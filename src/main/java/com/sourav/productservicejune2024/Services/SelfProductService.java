package com.sourav.productservicejune2024.Services;

import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.Repository.ProductRepository;
import com.sourav.productservicejune2024.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        //Make a call to Database to fetch product with given id


        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
