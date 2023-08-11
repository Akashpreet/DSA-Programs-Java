// import java.text.BreakIterator;

public class First {
    Node head;
    private int size;

    First(){
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

    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Empty List, nothing to remove");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list, nothing to remove");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        First list=new First();
        list.addlast("is");
        list.addlast("a");
        list.addlast("list");
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
