// package Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * InnerPreOrder
 */
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class PreOrder {
    public static ArrayList<Integer> preOrderTrav(Node curr){
        ArrayList<Integer> preOrder=new ArrayList<Integer>();
        if(curr==null){
            return preOrder;
        }
        Stack<Node>st =new Stack<>();
        st.push(curr);
        while (!st.isEmpty()) {
            Node topNode=st.peek();
            preOrder.add(topNode.data);
            st.pop();
            if(topNode.right!=null){
                st.push(topNode.right);
            }
            if(topNode.left!=null){
                st.push(topNode.left);
            }
        }
        return preOrder;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.right.left=new Node(8);
        root.right.right.left=new Node(9);
        root.right.right.right=new Node(10);

        ArrayList<Integer> preOrder=new ArrayList<>();
        preOrder=preOrderTrav(root);
        System.out.println("The preOrder is ");
        for(int i=0;i<preOrder.size();i++){
            System.out.print(preOrder.get(i)+" ");
        }
    }
}
