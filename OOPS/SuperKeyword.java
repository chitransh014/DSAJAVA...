public class SuperKeyword {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
class Animal{
 Animal(){
    System.out.println("Animal class constructor called");
 }
}
class Dog extends Animal{
    Dog(){
        super(); // use to refer immediate parent
        System.out.println("Dog class constructor called");
    }
}
