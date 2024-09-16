package org.example.homework.oop.tasks2.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTests {

    @Test
    public void creationProductTest() {
        String productName = "Product Name";
        Double productPrice = 123.0;

        Product product = new Product();
        product.setName(productName);
        product.setPrice(productPrice);

        Assertions.assertEquals(productName, product.getName());
        Assertions.assertEquals(productPrice, product.getPrice());
    }
}
