

public class MultiLevel {
  

    public static void main(String[] args) {
        Dog lucy =new Dog();
        lucy.eat();
        lucy.legs=4;
        System.err.println(lucy.legs);
        lucy.breed="indian";
        System.out.println(lucy.breed);
    }
}
class Animal{
    String name;
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
   
    String breed;
    
}


