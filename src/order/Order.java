package order;

import customer.Customer;

public class Order {
    private Customer customer;
    private double totalAmount;
    private boolean isPaid;

    public Order(Customer customer, double totalAmount) {
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.isPaid = false;
    }

    public void placeOrder() {
        System.out.println("Order placed for customer: " + customer.getName());
        System.out.println("Total Amount: $" + totalAmount);
    }

    public void makePayment(double amount) throws Exception {
        if (amount < totalAmount) {
            throw new Exception("Insufficient payment. Order cannot be completed.");
        }
        this.isPaid = true;
        System.out.println("Payment successful for amount: $" + amount);
    }
}
