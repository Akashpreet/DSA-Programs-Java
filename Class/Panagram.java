import java.util.Scanner;

public class Panagram {
    public static void contain(String str) {
        str=str.toLowerCase();
        boolean present=true;
        for(char i='a';i<='z';i++){
            if(!str.contains(String.valueOf(i))){
                present=false;
                break;
            }
        }
        if(present){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not pangram");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        contain(str);
    }
}
