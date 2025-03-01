package Inheritance;
class Animal {
    void eat() {
        System.out.println("Animal eat grass");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("mammak walk slow");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("dog bark loud");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
    }
}
