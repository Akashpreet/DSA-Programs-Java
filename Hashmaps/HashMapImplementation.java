import java.util.LinkedList;

public class HashMapImplementation {
    public static class MyHashMap<k,v> {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_CAPACITOR=.75f;
        private class Node{
            k key;
            v value;
            Node(k key, v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[]bucket;
        private void initBuckets(int N){
            // N-capacity/size of buckets
            bucket=new LinkedList[N];
            for(int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }
        }
        private int HashFunc(k key){
            int hc=key.hashCode();
            return (Math.abs(hc))%bucket.length;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return bucket.length;
        }
        public float load_factor(){
            return (n*1.0f)/bucket.length; 
        }
        private int searchinBucket(LinkedList<Node> ll,k key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node>[] oldBucket=bucket;
            n=0;
            initBuckets(oldBucket.length*2);
            for(var buckets:oldBucket){
                for(var node:buckets){
                    put(node.key, node.value);
                }
            }
        }
        public int size(){
            // return number of entries in map
            return n;
        }
        public void put(k key,v value){
            // insert or update
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=bucket[bi];
            int ei=searchinBucket(currBucket,key);
            if(ei==-1){
                // key didn't exist insert a new node
                Node node=new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else{
                // update case
                Node currNode=currBucket.get(ei);
                currNode.value=value;
            }
            if(n>=bucket.length*DEFAULT_LOAD_CAPACITOR){
                rehash();
            }
        }
        public v get(k key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=bucket[bi];
            int ei=searchinBucket(currBucket,key);
            if(ei!=-1){
                // key exists
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }
        public v remove(k key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=bucket[bi];
            int ei=searchinBucket(currBucket,key);
            if(ei!=-1){
                // key exists
                Node currNode=currBucket.get(ei);
                v val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            else{
                return null;
            }
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp=new MyHashMap<>();
        System.out.println("Testing Put");
        mp.put("A", 1);
        mp.put("B", 2);
        mp.put("C", 3);
        System.out.println("Testing size "+mp.size());
        mp.put("C", 30);
        System.out.println("Testing size "+mp.size());
        System.out.println(mp.get("A"));
        System.out.println(mp.get("B"));
        System.out.println(mp.get("C"));
        System.out.println(mp.get("D"));
        System.out.println(mp.remove("C"));
        System.out.println(mp.size());
        System.out.println(mp.remove("C"));
        System.out.println("Capacity "+mp.capacity());
        System.out.println("Load Factor"+mp.load_factor());
    }
}
