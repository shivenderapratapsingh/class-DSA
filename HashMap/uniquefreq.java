package HashMap;
import java.util.*;
public class uniquefreq {
    public static ArrayList <Integer> unique(int [] arr){
        ArrayList<Integer> unique1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)%2!= 0) {
                unique1.add(key);
            }
        }
        return unique1;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,4,5,6,7,8,9,10,11,12,13,13,14,15};
        ArrayList<Integer> unique1=unique(arr);
        System.out.println("The odd value elements in the array are: "+unique1);
    }
}
