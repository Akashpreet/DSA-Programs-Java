// package Trees;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class InOrder {
    // Recursive Function
    // public static void inOrderTrav(Node curr,ArrayList<Integer> list){
    //     if(curr==null){
    //         return;
    //     }
    //     inOrderTrav(curr.left, list);
    //     list.add(curr.data);
    //     inOrderTrav(curr.right, list);
    // }
    // Iterative Function
    public static ArrayList<Integer> inOrderTrav(Node curr){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Node> st=new Stack<Node>();
        Node root=curr;
        while (true) {
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root=st.pop();
                list.add(root.data);
                root=root.right;
            }

        }
        return list;
    }
    public static int height(Node curr){
        if(curr==null){
            return 0;
        }
        int le=height(curr.left);
        int ri=height(curr.right);
        int ans=Math.max(le, ri)+1;
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        ArrayList<Integer> list=new ArrayList<>();
        list=inOrderTrav(root);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int ans=height(root);
        System.out.println(ans);
    }
}