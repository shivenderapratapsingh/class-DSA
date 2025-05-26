
import java.util.*;
public class knapsack {
    public static int knapsack1(int[] profit, int[] weights, int capacity) {
        int n = weights.length;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> b[0]/b[1] - a[0]/a[1]); 
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{profit[i], weights[i]}); 
        }
        int total_weight=0;
        int remcapacity=capacity;
        while(!pq.isEmpty() && remcapacity>0){
            int [] arr=pq.poll();
            int profits=arr[0];
            int weight=arr[1];
            if(weight<=remcapacity){
                total_weight+=profits;
                remcapacity-=weight;
            }
            else{

                total_weight += profits*remcapacity / weight;
                remcapacity = 0;
            }
        }
        return total_weight;
    }
    public static void main(String[] args) {
        int[] profit = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        int maxProfit = knapsack1(profit, weights, capacity);
        System.out.println("Maximum profit in Knapsack = " + maxProfit);


        
    }
}
