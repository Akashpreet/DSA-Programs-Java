public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        queueLL qu=new queueLL();
        qu.display();
        System.out.println(qu.isEmpty());
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.display();
        System.out.println(qu.size);
        System.out.println(qu.peek());
        qu.remove();
        qu.display();
        System.out.println(qu.size);
        System.out.println(qu.isEmpty());
    }
}
