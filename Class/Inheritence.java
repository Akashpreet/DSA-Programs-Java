import java.util.*;
public class Inheritence {
    int[] arr=new int[10];
    Inheritence(){
       Scanner obj=new Scanner(System.in);
       int x=obj.nextInt();
       arr=new int [x];
       for(int i=0;i<x;i++){
           arr[i]=obj.nextInt();
       }
    }
    public int abc(){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
class Important1 extends Inheritence{
    int[] arr1=new int[10];
    Important1(){
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        arr1=new int [x];
        for(int i=0;i<x;i++){
            arr1[i]=obj.nextInt();
        }
    }
    public int xyz(){
        int cv=abc();
        for(int i=0;i<arr1.length;i++){
            cv+=arr1[i];
        }
        return cv;
    }
}