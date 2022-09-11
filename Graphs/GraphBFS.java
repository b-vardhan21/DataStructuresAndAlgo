package Graphs;

import java.util.*;
class GraphBFS{

    static void addEdge(ArrayList<ArrayList<Integer>> adj ,int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void BFS(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean[] visited = new boolean[v];
        for(int i=0;i<v;i++){
            visited[i] = false;
        }

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(q.isEmpty()==false){
            int u = q.poll();
            System.out.print(u+" ");
            for(int V:adj.get(u)){
                if(visited[V] == false){
                    visited[V] = true;
                    q.add(V);
                }

            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4);
    	addEdge(adj,2,4);

        System.out.println("Following is Breadth First Traversal: "); 
	    BFS(adj,v,0);

    }

}