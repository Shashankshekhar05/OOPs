package Polymorphism;
interface Shape {
    double area(); // Abstract method
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }

    @Override
    public double area() {
        return length * width;
    }
}

public class Demo{
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        System.out.println("Circle Area: " + shape1.area());
        System.out.println("Rectangle Area: " + shape2.area());
    }
}