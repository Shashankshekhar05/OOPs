package Polymorphism;
class Calculator {
    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (different parameter count)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles (different parameter type)
    double add(double a, double b) {
        return a + b;
    }
}

public class staticBinding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));        // Calls Method 1 → 5
        System.out.println(calc.add(2, 3, 4));     // Calls Method 2 → 9
        System.out.println(calc.add(2.5, 3.5));    // Calls Method 3 → 6.0
    }
}