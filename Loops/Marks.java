import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of student");
        int n;
        do {
            int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }
            else if(marks<=89 || marks>=59){
                System.out.println("This is also good");
            }
            else if(marks<59 || marks>=0){
                System.out.println("This is good as well");
            }
            System.out.println("Press 1 for input more and 0 for exit");
            n=sc.nextInt();
        } while (n==1);
    }
}
