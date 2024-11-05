import java.util.LinkedList;
import java.util.Queue;

public class first {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        System.out.println(qu.isEmpty());
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        System.out.println(qu.size());
        System.out.println(qu);
        System.out.println(qu.isEmpty());
        qu.remove();
        System.out.println(qu);
        System.out.println(qu.size());
        System.out.println(qu.peek());
        
    }
}
