import java.util.Scanner;

public class MoveX {
    public static void move(String s,int indx,int count,String nStr) {
        if(indx==s.length()){
            for(int i=0;i<count;i++){
                nStr+='x';
            }
            System.out.println(nStr);
            return;
        }
        char currChar=s.charAt(indx);
        if(currChar=='x'){
            count++;
            move(s, indx+1, count, nStr);
        }
        else{
            nStr+=currChar;
            move(s, indx+1, count, nStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        move(s, 0, 0, "");
    }
}
