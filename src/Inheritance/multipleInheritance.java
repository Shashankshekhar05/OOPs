package Inheritance;
interface Walkable { // Interface 1
    default void walk() {
        System.out.println("Walking...");
    }
}

interface Swimmable { // Interface 2
    default void swim() {
        System.out.println("Swimming...");
    }
}

class Duck implements Walkable, Swimmable {
    // Multiple inheritance via interfaces
    // Duck can use walk() and swim() methods
}
public class multipleInheritance {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.walk();
    }
}
