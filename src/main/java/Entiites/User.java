package Entiites;

public class User {
    private String name;
    private String email;
    private Cart cart;

    public User() {
    }

    public User(String name, String email, Cart cart) {
        this.name = name;
        this.email = email;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart.toString() +
                '}';
    }
}
