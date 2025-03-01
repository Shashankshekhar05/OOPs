package Inheritance;
class Car { // Superclass
    void car() {
        System.out.println("low capacity ");

    }
}

class Bus extends Car { // Subclass 1
    void bus() {
        System.out.println("More than car capacity");
    }
}

class Truck extends Car { // Subclass 2
    void truck() {
        System.out.println("Truck large capacity");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Bus b = new Bus();
        b.bus();
    }

}
