

public class SingleLevel {
    

    public static void main(String[] args) {
        Fish dolphin =new Fish();
        dolphin.eat();
        dolphin.fins();
        dolphin.swims();
    }
    
}

//       THIS IS A BASE CLASS
class Animal{
    String color;
    void eat(){
        System.out.println("Fishes's food");
    }
    void swims(){
        System.out.println("Swimming");
    }
}

//      THIS IS A DERIVED CLASS OR SUBCLASS
class Fish extends Animal{

    void fins(){
        System.out.println("have many fins");
    }
}



