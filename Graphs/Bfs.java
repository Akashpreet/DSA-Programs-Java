package Graphs;


import java.util.*;

public class Bfs {
    public static ArrayList<Integer> bfs(int n,ArrayList<ArrayList<Integer>>adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[n];
        Queue<Integer> qu=new LinkedList<>();
        qu.add(0);
        vis[0]=true;
        while (!qu.isEmpty()) {
            Integer node=qu.poll();
            bfs.add(node);
            for(Integer i:adj.get(node)){
                if(vis[i]==false){
                    vis[i]=true;
                    qu.add(i);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        ArrayList<Integer> arr=bfs(5, adj);
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}

