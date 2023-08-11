import java.util.*;
public class Swap{
    int a;
    int b;
    Swap(int x,int y){
        this.a=x;
        this.b=y;
    }
    public static void swap1(Swap obj) {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    public static void main(String[] args) {
        Swap obj1=new Swap(5,4);
        swap1(obj1);

        System.out.println(obj1.a+" "+obj1.b);
    }
}
