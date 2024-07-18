package com.sourav.productservicejune2024;

import com.sourav.productservicejune2024.Repository.ProductRepository;
import com.sourav.productservicejune2024.projection.ProductWithSomeData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceJune2024ApplicationTests {
    private ProductRepository productRepository;

    public ProductServiceJune2024ApplicationTests(ProductRepository productRepository){
        this.productRepository=productRepository;

    }

    @Test
    void contextLoads() {
    }

    @Test
    void testDBQueries(){
        List<ProductWithSomeData> productWithSomeData =
                productRepository.randomSearchMethod();

        System.out.println("DEBUG");


    }

}
