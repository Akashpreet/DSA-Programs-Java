public class ReverseLLRecursive {
    Node head;
    private int size;

    ReverseLLRecursive(){
        size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        ReverseLL list=new ReverseLL();
        list.addFirst("this");
        list.addFirst("is");
        list.addFirst("a");
        list.addFirst("list");
        list.printList();
        // list.head=list.reverse(list.head);9
        list.printList();
    }
}
