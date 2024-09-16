package org.example.homework.oop.tasks2.product;

import java.util.HashMap;

public class PriceList {
    private final HashMap<String, Double> productList = new HashMap<>();

    public void addNewProduct(Product newProduct) {
        productList.put(newProduct.getName(), newProduct.getPrice());
    }

    public void changeProductPrice(String productName, Double newPrice) {
        productList.replace(productName, newPrice);
    }

    public Double getProductPrice(String productName) {
        return productList.getOrDefault(productName, 0.0);
    }

    public HashMap<String, Double> getProductList() {
        return productList;
    }
}
