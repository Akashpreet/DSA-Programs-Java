import java.util.Scanner;

public class CapitalFirstCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String str2="";
        for(String i: arr){
            str2+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
        }
        System.out.println(str2);
    }
}
