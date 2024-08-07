package com.sourav.productservicejune2024.Repository;

import com.sourav.productservicejune2024.Models.Category;
import com.sourav.productservicejune2024.Models.Product;
import com.sourav.productservicejune2024.projection.ProductWithSomeData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //Product repository should contain all the methods (CRUD) related to product model

    Product findByTitle(String title);


    List<Product> findByPriceGreaterThan(Double price);

    List<Product> findByPriceLessThan(Double price);

    List<Product> findProductByTitleLike(String word); //case sensitive

    List<Product> findProductByTitleLikeIgnoreCase(String word); //case insensitive

    List<Product> findTopByTitleContainingAndPriceLessThanEqualOrderById(String title, Double price);

    List<Product> findProductByTitleContainsAndPriceLessThan(String word, Double price);

    Optional<Product> findById(Long id);

    Page<Product> findAll(Pageable pageable);


    // HQL -Hybernate
    @Query("select p.id, p.title, p.price from Product p")
    List<ProductWithSomeData> randomSearchMethod();



}

/*
1. repository should be an Interface.
2. repository should extend JPARepository.
 */