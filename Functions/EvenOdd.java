import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class EvenOdd {
    public static void EvenNumber(int n){
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Not Even Number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        EvenNumber(n);
    }
}
