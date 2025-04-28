import java.util.*;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(30);
        
        System.out.println("Priority Queue: " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
    
}
