import java.util.PriorityQueue;

public class activityselection {
      public int activitySelection(int[] start, int[] finish) {
        // code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<start.length;i++){
            pq.offer(new int []{start[i],finish[i]});
        }
        int end=-1;
        int cnt=0;
        while(!pq.isEmpty()){
            int [] arr=pq.poll();
            int st=arr[0];
            int fin=arr[1];
            if(st>end){
                end=fin;
                cnt++;
            }
            
        }
        return cnt;
        
    }
}

