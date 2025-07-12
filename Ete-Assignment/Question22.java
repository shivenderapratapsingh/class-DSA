import java.util.ArrayList;

public class Question22 {
     public int findCircleNum(int[][] arr) {
        int V = arr.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Create adjacency list
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Convert adjacency matrix to adjacency list
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(arr[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
        boolean[] check = new boolean[V];
        int count = 0;
        
        // Count connected components
        for(int i = 0; i < V; i++) {
            if(!check[i]) {
                count++;
                dfs(i, check, adj); // ✅ Fix: start DFS from node i
            }
        }
        
        return count;
    }

    public static void dfs(int node, boolean[] check, ArrayList<ArrayList<Integer>> adj) {
        check[node] = true;
        for(Integer neighbor : adj.get(node)) {
            if(!check[neighbor]) {
                dfs(neighbor, check, adj);
            }
        }
    }
}
