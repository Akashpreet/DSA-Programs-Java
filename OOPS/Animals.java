abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal.");
    }
}
class Horse extends Animal{
    public void walk() {
        System.out.println("Wals on 4 legs");
    }
    Horse(){
        System.out.println("You are creating a new horse");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class Animals {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();

    }
}
