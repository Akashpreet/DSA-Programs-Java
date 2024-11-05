import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevrseQueue {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        System.out.println(qu);
        Stack<Integer> st=new Stack<>();
        while (qu.size()>0) {
            st.push(qu.poll());
        }
        while (st.size()>0) {
            qu.add(st.pop());
        }
        System.out.println(qu);
    }
}
