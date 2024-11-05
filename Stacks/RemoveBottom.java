import java.util.Stack;

public class RemoveBottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer>rt=new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        // System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
