import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int n,String src,String hlp,String des){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to des");
            return;
        }
        toh(n-1,src,des,hlp);
        System.out.println("Transfer disk "+n+" from "+src+" to des");
        // toh(n-1,hlp,src,des);
        toh(n-1, hlp, src, des);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n, "S", "H", "D");
    }
}
