import java.util.Scanner;

public class Count_ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String x="";
        while(n>0){
            int a=n%2;
            x=a+x;
            n=n/2;
        }
        int l=x.length();
        for(int i=0;i<l;i++){
            if(x.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
