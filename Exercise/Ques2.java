import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            if((i%2)!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
