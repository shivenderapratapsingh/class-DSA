package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs1 {
    public static void depth(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,boolean [] arr){
        arr[node]=true;
        ans.add(node);
        for(Integer i:adj.get(node)){
            if(!arr[i]){
                arr[i]=true;
                depth(i,adj,ans,arr);
            }
        }

    }

    public static ArrayList<Integer> dfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean [] arr=new boolean[v+1];
        depth(1,adj,ans,arr);
        return ans;
    }
    public static ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        vis[1]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for(Integer it:adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }

        }
        return bfs;
    }
    public static void main(String[] args) {
        int n = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize n + 1 lists (1-based indexing)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (undirected graph)
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);
        ArrayList<Integer> ans=dfs(n, adj);
        for(Integer i:ans){
            System.out.print(i);
        }
    }
    
}
