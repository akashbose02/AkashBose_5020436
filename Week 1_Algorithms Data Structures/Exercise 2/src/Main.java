package com.example.ecom;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P005", "Product 5", "Category 1"),
            new Product("P003", "Product 3", "Category 2"),
            new Product("P004", "Product 4", "Category 1"),
            new Product("P008", "Product 8", "Category 2")
        };

        // Linear Search Test
        Product resultLinear = SearchUtils.linearSearch(products, "P008");
        System.out.println("Linear Search Result: " + resultLinear);

        // Sort products by productId for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        // Binary Search Test
        Product resultBinary = SearchUtils.binarySearch(products, "P008");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
