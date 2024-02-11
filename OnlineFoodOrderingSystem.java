import java.util.ArrayList;

// Define a class for the Food Item
class FoodItem {
    String name;
    double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Define a class for the Customer
class Customer {
    String name;
    String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

// Define a class for the Order
class Order {
    Customer customer;
    ArrayList<FoodItem> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public void displayOrder() {
        System.out.println("Customer Name: " + customer.name);
        System.out.println("Customer Address: " + customer.address);
        System.out.println("Ordered Items:");
        for (FoodItem item : items) {
            System.out.println(item.name + " - $" + item.price);
        }
    }
}

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {
        // Create a few food items
        FoodItem burger = new FoodItem("Burger", 5.99);
        FoodItem pizza = new FoodItem("Pizza", 8.99);
        FoodItem fries = new FoodItem("French Fries", 2.49);

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St, City");

        // Create an order
        Order order = new Order(customer);

        // Add items to the order
        order.addItem(burger);
        order.addItem(pizza);
        order.addItem(fries);

        // Display the order
        order.displayOrder();
    }
}
