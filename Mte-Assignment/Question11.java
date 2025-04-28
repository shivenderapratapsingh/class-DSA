import java.util.HashMap;

public class Question11 {
    public static int [] twosum(int [] arr,int k){
        int [] arr1={-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=k-arr[i];
            if(map.containsKey(complement)){
                arr1=new int[]{i,map.get(complement)};
                return arr1;
            }
            map.put(arr[i],i);
        }
        return arr1;
    }
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int k=9;
        int [] result=twosum(arr,k);
        System.out.println("The indices of the two numbers that add up to " + k + " are: [" + result[0] + ", " + result[1] + "]");

}
}
