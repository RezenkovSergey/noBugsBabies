package org.example.homework.oop.tasks2.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class PriceListTests {
    private final Product firstProduct = new Product();
    private final Product secondProduct = new Product();

    private final String firstProductName = "First product name";
    private final Double firstProductPrice = 1.0;

    private final String secondProductName = "Second product name";
    private final Double secondProductPrice = 2.0;


    @BeforeEach
    public void setUp() {
        firstProduct.setName(firstProductName);
        firstProduct.setPrice(firstProductPrice);

        secondProduct.setName(secondProductName);
        secondProduct.setPrice(secondProductPrice);
    }

    @Test
    public void addingNewProductTest() {
        PriceList priceList = new PriceList();
        priceList.addNewProduct(firstProduct);
        HashMap<String, Double> productList = priceList.getProductList();

        Assertions.assertTrue(productList.containsKey(firstProductName));
        Assertions.assertEquals(firstProductPrice, productList.get(firstProductName));
    }

    @Test
    public void gettingProductPriceTest() {
        PriceList priceList = new PriceList();
        priceList.addNewProduct(secondProduct);

        Assertions.assertEquals(secondProductPrice, priceList.getProductPrice(secondProductName));
    }

    @Test
    public void changingProductPriceTest() {
        Double newPrice = 13.0;
        PriceList priceList = new PriceList();
        priceList.addNewProduct(secondProduct);
        priceList.changeProductPrice(secondProductName, newPrice);

        Assertions.assertEquals(newPrice, priceList.getProductPrice(secondProductName));
    }


}
