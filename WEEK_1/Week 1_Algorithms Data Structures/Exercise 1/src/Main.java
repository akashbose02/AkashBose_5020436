package com.example.inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Create products
        Product product1 = new Product("P001", "Product 1", 100, 29.99);
        Product product2 = new Product("P002", "Product 2", 50, 49.99);

        // Add products
        manager.addProduct(product1);
        manager.addProduct(product2);

        // List all products
        System.out.println("Listing all products before update:");
        manager.listProducts();

        // Update a product
        Product updatedProduct1 = new Product("P001", "Updated Product 1", 120, 34.99);
        manager.updateProduct("P001", updatedProduct1);

        // List all products
        System.out.println("Listing all products after update:");
        manager.listProducts();

        // Delete a product
        manager.deleteProduct("P002");

        // List all products
        System.out.println("Listing all products after deletion:");
        manager.listProducts();
    }
}
