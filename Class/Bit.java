import java.util.*;
public class Bit {
    public static void main(String[] args) {
        // int n = 5;

        // int pos = 2;

        // int bitmask = 1 << pos;

        // if ((bitmask & n) == 0)

        //     System.out.println("bit was zero");

        // else {

        //     System.out.println("bit was one");

        // }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((bitmask&n)==0){                     //this is for getting bit value
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is 1");
        }
        //this is for setting the bit value
        int set;
        set=bitmask|n;
        System.out.println(set);
        //this is for clearing the particular bit
        int clear=~(bitmask);
        int value=clear&n;
        System.out.println(value);
        //this is for updating bit position
        int update=sc.nextInt();
        if(update==1){
            System.out.println(set);
        }
        else{
            System.out.println(value);
        }
    }
}

    


