package Inheritance;
class Animals { // Superclass
    void eat() {
        System.out.println("Animal eat grass");
    }
}

class Birds extends Animals { // Subclass 1 (single inheritance)
    void fly() {
        System.out.println("Birds fly high");
    }
}

class Penguins extends Birds { // Subclass of Bird (multilevel)
    void swim() {
        System.out.println("penguins swim in water");
    }
}

class Sparrows extends Birds { // Another subclass of Bird (hierarchical)
    void voice() {
        System.out.println("Sparrows voice sweet");
    }
}
public class hybridInheritance {
    public static void main(String[] args) {
        Penguins p = new Penguins();
        p.fly();
    }
}
