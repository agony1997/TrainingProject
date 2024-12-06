package com.training.web.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class ProductJPATester {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void assertAddProduct() {

        Product savedProduct = productRepository.save(new Product());
        Product foundProduct = entityManager.find(Product.class, savedProduct.getId());

        Assertions.assertEquals(savedProduct, foundProduct);

    }

}
