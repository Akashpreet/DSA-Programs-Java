import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Average {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0;
        for(int i=0;i<=n;i++){
            i=sc.nextInt();
            a=a+i;
        }
        System.out.println(a/n);
    }
}
