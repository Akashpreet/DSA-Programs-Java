import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String v1=st.pop();
                String v2=st.pop();
                char op=ch;
                String str2=v1+v2+op;
                st.push(str2);
            }
        }
        System.out.println(st);
    }
}
