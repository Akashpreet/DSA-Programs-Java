import java.util.*;
public class Lexigraaphical {
    static void sortFruits(String str[]){
        int n=str.length;
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(str[j].compareTo(str[smallest])<0){
                    smallest=j;

                }
            }
            String temp=str[i];
            str[i]=str[smallest];
            str[smallest]=temp;
        }    
    }
    public static void main(String[] args) {
        String fruits[]={"Kiwi","Banana","Orange","Grapes","Apple","Guava"};
        sortFruits(fruits);
        for(String i:fruits){
            System.out.print(i+" ");
        }
    }
}
