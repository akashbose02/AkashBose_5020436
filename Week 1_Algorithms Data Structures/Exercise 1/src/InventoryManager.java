package com.example.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product has not been found.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product has not been found.");
        }
    }

    // Get a product
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    // List all products
    public void listProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
