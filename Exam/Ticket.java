import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        if(m+j<=total){
            System.out.println("mike booked "+m);
            System.out.println("John bookes "+j);
        }
        else{
            if(m<total){
                System.out.println("mike bookes "+m);
            }
            else{
                System.out.println("john "+j);
            }
        }
        // char ch='A';/
        // System.out.print((int)ch);
    }
}
