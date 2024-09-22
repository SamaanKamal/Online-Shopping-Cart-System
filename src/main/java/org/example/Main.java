package org.example;

import Entiites.Catalog;
import Entiites.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", "High-end gaming laptop", 1200.99, 10, "Electronics");
        Product product2 = new Product("Smartphone", "Latest model smartphone", 699.99, 20, "Electronics");
        Product product3 = new Product("Blender", "Kitchen appliance", 49.99, 15, "Home Appliances");

        // Create a catalog and add products
        Catalog catalog = new Catalog();
        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);
    }
}