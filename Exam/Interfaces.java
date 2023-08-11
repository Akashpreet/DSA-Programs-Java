// package Exam;
/**
 * InnerInterfaces
 */
interface bicycle {

    int a=45;
    void appleBrakes(int decrement);
    void speedUp(int increment);
}
interface horn{
    void horn1();
    void horn2();
}
class Avon implements bicycle,horn{
    void blowHorn(){
        System.out.println("Pee Pee");
    }
    public void appleBrakes(int decrement){
        System.out.println("Applying Breaks");
    }
    public void speedUp(int increment) {
        System.out.println("Speeding Up");
    }
    public void horn1(){
        System.out.println("Ping Pong");
    }
    public void horn2(){
        System.out.println("Po Po");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Avon cycle=new Avon();
        cycle.appleBrakes(1);
        // System.out.println(cycle.a);
        cycle.horn1();
        cycle.horn2();
    }
}
