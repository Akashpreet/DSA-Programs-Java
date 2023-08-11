// import javax.tools.Diagnostic;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void revPrint(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void ranPrint(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }
    public static void insertAtTail(Node head,int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtIdx(Node head,int idx,int x){
        Node s=head;
        for(int i=0;i<idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(33);
        Node c=new Node(4);
        Node d=new Node(89);
        Node e=new Node(5);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        printLL(a);
        revPrint(e);
        ranPrint(c);
        int x=35;
        Node newHead=insertAtHead(a, x);
        printLL(newHead);
        insertAtTail(a, x);
        printLL(a);
        insertAtIdx(a, 3, x);

        printLL(a);
    }
}
