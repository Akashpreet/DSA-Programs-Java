public class ArrayImplementation {
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int arr[]=new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue qu=new queue();
        qu.display();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.display();
    }
}
