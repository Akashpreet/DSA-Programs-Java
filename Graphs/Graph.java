package Graphs;

import java.util.ArrayList;

public class Graph {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        //edge1--2
        graph.get(1).add(2);
        graph.get(2).add(1);

        //edje 2--3
        graph.get(2).add(3);
        graph.get(3).add(2);

        //edge 3--2
        graph.get(3).add(2);
        graph.get(2).add(3);

        for(int i=1;i<n;i++){
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
        // int adj[][]=new int[n+1][n+1];
        // //edje 1--2
        // adj[1][2]=1;
        // adj[2][1]=1;

        // //edje1--3
        // adj[1][3]=1;
        // adj[3][1]=1;

        // //edje2--3
        // adj[2][3]=1;
        // adj[3][2]=1;
    }
}
