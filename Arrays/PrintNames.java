import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter the String Array: ");
        String names[]=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}
