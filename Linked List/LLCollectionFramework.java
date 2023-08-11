// package Linked List;
import java.util.*;
public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("this");
        list.add("is");
        list.add("list");
        System.out.println(list);
        list.add(2,"a");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}
