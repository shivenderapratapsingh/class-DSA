import java.util.PriorityQueue;

public class Nmeeting {
      public int maxMeetings(int start[], int end[]) {
        // add your code here
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<start.length;i++){
            pq.offer(new int[]{start[i],end[i]});
        }
        int e=-1;
        int cnt=0;
        while(!pq.isEmpty()){
            int [] arr=pq.poll();
            int st=arr[0];
            int en=arr[1];
            if(st>e){
                e=en;
                cnt++;
            }
        }
        return cnt;
        
    }
}
