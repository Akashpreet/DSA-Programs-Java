import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
public class LevelOrder {
    public static ArrayList<Integer> levelOrderTrav(Node curr){
        ArrayList<Integer> levelOrder=new ArrayList<Integer>();
        Queue<Node> qu=new LinkedList<Node>();
        if(curr==null){
            return levelOrder;
        }
        qu.offer(curr);
        while (!qu.isEmpty()) {
            if(qu.peek().left!=null){
                qu.offer(qu.peek().left);
            }
            if(qu.peek().right!=null){
                qu.offer(qu.peek().right);
            }
            levelOrder.add(qu.poll().data);
        }
        return levelOrder;
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

        ArrayList<Integer> levelOrder=new ArrayList<>();
        levelOrder=levelOrderTrav(root);
        for(int i=0;i<levelOrder.size();i++){
            System.out.print(levelOrder.get(i)+" " );
        }
    }
}
