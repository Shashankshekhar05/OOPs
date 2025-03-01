package Polymorphism;
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { // Overridden method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() { // Overridden method
        System.out.println("Cat meows");
    }
}

public class dynamicBinding {
    public static void main(String[] args) {
        Animal myAnimal;// Reference of superclass

        myAnimal = new Dog(); // Points to Dog object
        myAnimal.makeSound(); // Output: "Dog barks"

        myAnimal = new Cat(); // Points to Cat object
        myAnimal.makeSound(); // Output: "Cat meows"
    }
}