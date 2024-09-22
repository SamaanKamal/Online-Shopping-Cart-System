package Entiites;

public class Order {
    private User user;
    private Cart cart;
    private boolean paymentStatus;
    private String shippingDetails;
    private String estimatedDeliveryTime;

    public Order() {
    }

    public Order(User user, Cart cart, boolean paymentStatus, String shippingDetails) {
        this.user = user;
        this.cart = cart;
        this.paymentStatus = paymentStatus;
        this.shippingDetails = shippingDetails;
    }

    @Override
    public String toString() {
        return "Order Summary:\n" + cart.toString() + "\nShipping to: " + shippingDetails;
    }
}
