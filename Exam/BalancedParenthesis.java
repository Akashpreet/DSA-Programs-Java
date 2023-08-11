import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==')'){
                count1++;
            }
            if(ch[i]=='('){
                count2++;
            }
            if(ch[i]=='{'){
                count3++;
            }
            if(ch[i]=='}'){
                count4++;
            }
            if(ch[i]=='['){
                count5++;
            }
            if(ch[i]==']'){
                count6++;
            }
        }
        if(count1==count2 && count3==count4 && count5==count6){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
