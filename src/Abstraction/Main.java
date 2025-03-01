package Abstraction;

// Interface example
interface PaymentGateway {
    void processPayment(double amount); // Abstract method
    default void refund(double amount) { // Default method
        System.out.println("Refunded: " + amount);
    }
}

// Abstract class example
abstract class Shape {
    abstract double area(); // Abstract method
    void printArea() { // Concrete method
        System.out.println("Area: " + area());
    }
}

// Concrete implementations
class PayPal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid via PayPal: " + amount);
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPal();
        paypal.processPayment(100.0);
        paypal.refund(50.0);

        Shape circle = new Circle(5);
        circle.printArea();
    }
}
