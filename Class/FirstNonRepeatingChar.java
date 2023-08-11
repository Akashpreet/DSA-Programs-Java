import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i), str.indexOf(str.charAt(i))+1)==-1){
                System.out.println(str.charAt(i));
                break;
            }
        }
        
    }
}
