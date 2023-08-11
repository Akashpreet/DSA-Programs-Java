import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        float radius=sc.nextFloat();
        System.out.println(radius);
        System.out.println("Enter the value of pie ");
        float pie=sc.nextFloat();
        float area=pie*radius*radius;
        System.out.println("Area of circle is ");
        System.out.println(area);
    }
}
