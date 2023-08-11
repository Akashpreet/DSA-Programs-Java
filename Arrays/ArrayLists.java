import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<Integer>();
        list1.add(3);
        list1.add(1);
        list1.add(2);
        // System.out.println(list1.get(0));
        // for(int i=0;i<list1.size();i++){
        //     System.out.println(list1.get(i));
        // }
        System.out.println(list1);
        list1.add(1,100);
        System.out.println(list1);
        list1.set(2, 10);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        list1.remove(Integer.valueOf(10));
        System.out.println(list1);
        boolean ans=list1.contains(Integer.valueOf(2));
        System.out.println(ans);
        boolean ans1=list1.contains(Integer.valueOf(20));
        System.out.println(ans1);

        // ArrayList li=new ArrayList();
        // li.add("Akash");
        // li.add(1);
        // li.add(true);
        // System.out.println(li);

        // System.out.println(list1);

        // int ele=list1.get(0);
        // System.out.println(ele);

        // list1.add(0,0);
        // System.out.println(list1);

        // list1.set(0, -1);
        // System.out.println(list1);

        // list1.remove(0);
        // System.out.println(list1);

        // int size=list1.size();
        // System.out.println(size);

        // for(int i=0;i<list1.size();i++){
        //     System.out.print(list1.get(i)+" ");
        // }
        // System.out.println();
        // Collections.sort(list1);
        // System.out.println(list1);
    }
}
