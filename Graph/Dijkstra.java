package Graph;
import java.util.*;

public class Dijkstra {

    // Custom Pair class
    static class Pair {
        int distance;
        int node;

        Pair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    // Dijkstra's algorithm implementation
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);
        dist[S] = 0;
        pq.add(new Pair(0, S));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.poll();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }

        return dist;
    }

    // Main method with test case
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        int S = 0; // Source vertex

        // Create adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (u, v, weight)
        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 2, 3, 6);
        addEdge(adj, 4, 2, 2);
        addEdge(adj, 4, 3, 4);

        int[] dist = dijkstra(V, adj, S);

        // Print results
        System.out.println("Shortest distances from source " + S + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    // Helper method to add edges
    static void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> adj, int u, int v, int w) {
        adj.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
        adj.get(v).add(new ArrayList<>(Arrays.asList(u, w))); // For undirected graph
    }
}
