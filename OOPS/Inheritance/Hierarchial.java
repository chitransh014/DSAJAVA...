

public class Hierarchial {
    public static void main(String[] args) {
        Mammals dog= new Mammals();
        Fish dolphin=new Fish();
        Bird smallBird=new Bird();
        dog.eats();
        dolphin.swim();
        smallBird.fly();


        
    }
}
class Animal{
    String name;
    void eats(){
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("Breathe ");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims in water");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Every bird can fly ");
    }
}
