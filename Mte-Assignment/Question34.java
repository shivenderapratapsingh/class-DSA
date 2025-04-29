import java.util.HashMap;

public class Question34 {
    public static int sub(int [] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int current_sum=0;
        int cnt=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            current_sum+=arr[i];
            if(map.containsKey(current_sum-k)){
                cnt+=map.get(current_sum-k);
            }
            map.put(current_sum,map.getOrDefault(current_sum, 0)+1);
        }
        return cnt;
    }
}
