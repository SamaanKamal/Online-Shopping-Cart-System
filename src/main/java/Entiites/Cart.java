package Entiites;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addItem(Product product) {
        products.add(product);
    }

    public void removeItem(Product product) {
        products.remove(product);
    }

    public void updateQuantity(Product product, int quantity) {
        if (products.contains(product)) {
            product.setStockQuantity(quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void applyDiscount(double discountPercentage) {
        for (Product product : products) {
            double discountedPrice = product.getPrice() * (1 - discountPercentage / 100);
            product.setPrice(discountedPrice);
        }
    }

    @Override
    public String toString() {
        StringBuilder cartDetails = new StringBuilder("Shopping Cart:\n");
        for (Product product : products) {
            cartDetails.append(product.toString()).append("\n");
        }
        cartDetails.append("Total: $").append(calculateTotal());
        return cartDetails.toString();
    }
}
