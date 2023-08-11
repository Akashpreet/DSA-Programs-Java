import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ques3 {
    public static void Greatest(int a,int b){
        if(a>b){
            System.out.println("a is greatest");
        }
        else{
            System.out.println("b is greatest ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Greatest(a, b);
    }
}
