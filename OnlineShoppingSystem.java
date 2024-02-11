import java.util.ArrayList;

// Class for representing a Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class for representing a Customer
class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Class for representing an Order
class Order {
    private Customer customer;
    private ArrayList<Product> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void displayOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Ordered Items:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}

// Class for representing a Payment
class Payment {
    public static void processPayment(Order order) {
        System.out.println("Payment processed for order:");
        order.displayOrder();
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create some products
        Product laptop = new Product("Laptop", 999.99);
        Product smartphone = new Product("Smartphone", 499.99);
        Product headphones = new Product("Headphones", 99.99);

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St");

        // Create an order and add items
        Order order = new Order(customer);
        order.addItem(laptop);
        order.addItem(smartphone);
        order.addItem(headphones);

        // Display the order
        System.out.println("Current Order:");
        order.displayOrder();

        // Process payment
        Payment.processPayment(order);
    }
}

