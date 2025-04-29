import java.util.HashMap;

public class Question44{
    public static int [] twosum(int [] arr,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int extra=0;
        for(int i=0;i<arr.length;i++){
            extra=k-arr[i];
            if(mp.containsKey(extra)){
                return new int[] {mp.get(extra),i};
            }
            mp.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args) {


    }

}