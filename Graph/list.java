package Graph;
import java.util.*;

class GFG {
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

        // Print adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
