import java.util.HashMap;

public class question4 {
    public static int [] sum(int [] arr,int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=sum-arr[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1};
        
    }
}
