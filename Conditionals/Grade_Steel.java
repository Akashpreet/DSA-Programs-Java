import java.util.Scanner;

public class Grade_Steel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hardness");
        int h=sc.nextInt();
        System.out.println("Enter the Carbon Content");
        float c=sc.nextFloat();
        System.out.println("Enter the Tensile Strength");
        int t=sc.nextInt();
        if(h>50 && c<0.7 && t>5600){
            System.out.println(10);
        }
        else if(h>50 && c<0.7 && t<5600){
            System.out.println(9);
        }
        else if(h<50 && c<0.7 && t>5600){
            System.out.println(8);
        }
        else if(h>50 && c>0.7 && t>5600){
            System.out.println(7);
        }
        else if(h>50||c<0.7||t>5600){
            System.out.println(6);
        }
        else{
            System.out.println(5);
        }
    }    
}
