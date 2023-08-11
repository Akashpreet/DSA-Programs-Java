import java.util.*;
public class Lenght {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String str[]=new String[n];
        int len=0;
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            len+=str[i].length();
        }
        System.out.println(len);
    }
}
