import java.util.ArrayList;
import java.util.PriorityQueue;

public class jobsequencing {
      public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int max=0;
        for(int i:deadline){
            max=Math.max(max,i);
        }
        int n=deadline.length;
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
          for (int i = 0; i < n; i++) {
            pq.offer(new int[]{deadline[i], profit[i]});
        }
        int cnt=0;
        int [] deads=new int[max+1];
        int profits=0;
        while(!pq.isEmpty()){
            int [] arr=pq.poll();
            int dead=arr[0];
            int pr=arr[1];
            for(int i=dead;i>0;i--){
                if(deads[i]==0){
                    deads[i]=dead;
                    profits+=pr;
                    cnt++;
                    break;
                }
            }
        }
        list.add(cnt);
        list.add(profits);
        return list;
}
    
}
