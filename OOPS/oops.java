import java.sql.Struct;

// package OOPS;
/**
 * Inneroops
 */
class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }
    // Student(String name,int age){
    //     // System.out.println("Constructer called");
    //     this.name=name;
    //     this.age=age;
    // }
    // Student(Student s2){
    //     this.name=s2.name;
    //     this.age=s2.age;
    // }
    // Student(){

    // }
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name,int age) {
        System.out.println(name+" "+age);
    }
}
public class oops {
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="Blue";
        // pen1.type="Ball";
        // pen1.write();
        // Pen pen2=new Pen();
        // pen2.color="Black";
        // pen2.printColor();
        // pen1.printColor();
        Student s1=new Student();
        s1.name="Akashpreet Singh";
        s1.age=19;
        // Student s2=new Student(s1);
        // s2.printInfo();
        // s1.printInfo();
        s1.printInfo(s1.name, s1.age);
    }    
}
