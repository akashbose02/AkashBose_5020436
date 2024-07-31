package com.example.ecommerce;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O003", "Shreyasi", 120.50),
            new Order("O001", "Bob", 75.00),
            new Order("O004", "Charlie", 200.00),
            new Order("O002", "Chayan", 150.25)
        };

        // Test Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingUtils.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        SortingUtils.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
