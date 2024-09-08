
public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        Human hu = new Human();
        h.walk();
        h.eat();
        hu.walk();
        hu.eat();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();  // abstract class give only idea not implement
}

class Horse extends Animal {
    void walk() {
        System.out.println("Run on 4 legs");
    }
}

class Human extends Animal {
    void walk() {
        System.out.println("Run on 2 legs");
    }
}
