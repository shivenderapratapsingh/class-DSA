package Graph;
import java.util.*;
public class adjacency {
    public static ArrayList<ArrayList<Integer>> adj(ArrayList<ArrayList<Integer>> ab ,int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        for(ArrayList<Integer> edge:ab){
            int u=edge.get(0);
            int v=edge.get(1);
            ans.get(u).add(v);
            ans.get(v).add(u);
        }

        return ans;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));

        int n = 4;

        ArrayList<ArrayList<Integer>> adjacencyList = adj(edges, n);

        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + ": ");
            for (int v : adjacencyList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
