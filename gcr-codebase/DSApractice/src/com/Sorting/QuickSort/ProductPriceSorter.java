package com.Sorting.QuickSort;

import java.util.Arrays;

public class ProductPriceSorter {

    public static void main(String[] args) {
        double[] productPrices = {1200.50, 450.00, 89.99, 3500.00, 150.25, 450.00};

        System.out.println("Original Prices: " + Arrays.toString(productPrices));

        ProductPriceSorter sorter = new ProductPriceSorter();
        QuickSorter.quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Prices:   " + Arrays.toString(productPrices));
    }
}