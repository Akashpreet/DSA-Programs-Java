import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelements {
    public static void main(String[] args) {
        Queue<Integer>qu=new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);
        int k=3;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++) {
            st.push(qu.poll());
        }
        while (!st.isEmpty()) {
            qu.add(st.pop());
        }
        for(int i=0;i<qu.size()-k;i++){
            qu.add(qu.poll());
        }
        // while (st.size()>0) {
        //     qu.add(st.pop());
        // }
        System.out.println(qu);
    }
}
