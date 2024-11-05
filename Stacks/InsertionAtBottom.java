import java.util.Stack;

public class InsertionAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        int idx=3;
        int x=6;
        while(st.size()>idx){
            // System.out.println();
            // rt=st.pop();
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
