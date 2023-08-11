import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String a="Akash";
        // System.out.println(a);
        // String a="Akashpreet Singh";
        // System.out.println(a);
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        // System.out.println("Your name is "+a);
        // Concatenation 
        // String firstName="Akashpreet";
        // String lastName="Singh";
        // // String full=firstName+lastName;
        // String fullName=firstName+" "+lastName;
        // // System.out.println(full);
        // System.out.println(fullName);

        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }
        // String b=sc.nextLine();
        // if(a.compareTo(b)==0){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
        String name=a.substring(11,a.length());
        System.out.println(name);
    }
}
