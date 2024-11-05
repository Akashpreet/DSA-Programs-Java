package Graphs;

import java.util.ArrayList;

public class Dfs {
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> arr){
        vis[node]=true;
        arr.add(node);
        for(Integer i:adj.get(node)){
            if(vis[i]==false){
                dfs(i, vis, adj, arr);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V+1];
        vis[0]=true;
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(0,vis,adj,arr);
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        ArrayList<Integer> ans =dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
