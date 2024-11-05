import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        // System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            boolean flag=true;
            char ch=sb.charAt(i);
            if(ch==' '){
                continue;
            }
            int asci=(int)ch;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char a=(char)asci;
                sb.setCharAt(i, a);
            }
            else{
                asci-=32;
                char a=(char)asci;
                sb.setCharAt(i, a);
            }
        }
        System.out.println(sb);
    }
}
