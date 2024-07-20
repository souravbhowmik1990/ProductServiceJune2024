package com.sourav.productservicejune2024.Services;

import com.sourav.productservicejune2024.Models.Category;
import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.Repository.CategoryRepository;
import com.sourav.productservicejune2024.Repository.ProductRepository;
import com.sourav.productservicejune2024.exception.ProductNotFoundException;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository,
                                CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        //Make a call to Database to fetch product with given id
        Optional<Product>productOptional = productRepository.findById(productId);
            if (productOptional.isEmpty()) {
                throw new ProductNotFoundException("Product with id " + productId + " not found");

            }

        return productOptional.get();

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    //Patch API
    @Override
    public Product updateProduct(Long id, Product product) throws ProductNotFoundException {
        Optional<Product>productOptional = productRepository.findById(id);
        if (productOptional.isEmpty()) {
            throw new ProductNotFoundException("product with id" + id + "not available in database");
        }
        Product productInDatabase = productOptional.get();

        if (product.getTitle() != null){
            productInDatabase.setTitle(product.getTitle());
        }

        if (product.getPrice() != null){
            productInDatabase.setPrice(product.getPrice());
        }

        return productRepository.save(productInDatabase);
    }
    //Put API
    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product addNewProduct(Product product) {
        Category category = product.getCategory();

//        if(category.getId() == null){
//            //we need to create a new category object in database first
//            category = categoryRepository.save(category);
//            product.setCategory(category);
//
//        }
        return productRepository.save(product);

    }
}
