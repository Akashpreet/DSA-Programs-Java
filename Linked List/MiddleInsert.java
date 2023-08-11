// package Linked List;

public class MiddleInsert {
    Node head;
    private int size;
    MiddleInsert(){
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
    public void interest(int index,String data){
        if(index>size || index<0){
            System.out.println("Invalid index");
            return;
        }
        size++;
        Node newNode=new Node(data);
        if(head==null || index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currNode=head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
            currNode=currNode.next;
        }
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MiddleInsert list=new MiddleInsert();
        list.addFirst("this");
        list.addFirst("a");
        list.addFirst("list");
        list.interest(1, "is");
        list.printList();
    }
}
