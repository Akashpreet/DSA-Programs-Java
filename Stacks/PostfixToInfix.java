import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str="935+4*6/-";
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String v2=st.pop();
                String v1=st.pop();
                char op=ch;
                String str2="("+v1+op+v2+")";
                st.push(str2);
            }
        }
        System.out.println(st);
    }
}
