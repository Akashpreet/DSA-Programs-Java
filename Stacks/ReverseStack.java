import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer>st){
        if(st.size()==1){
            return;
        }
        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        System.out.println("Enter the number of elements");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
