
abstract class Animal {
    abstract public void walk(); 
    public void eat(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("You are Creating an new Animal");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("You created a horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // Animal animal = new Animal();
    }
}
