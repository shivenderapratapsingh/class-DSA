package Striver;
import java.util.*;


public class sumsubsequence {
    public static void sub(int idx,ArrayList<Integer> list,int sum,int [] arr){
       if(idx==arr.length){
         if(sum==0){
          for(Integer i:list){
            System.out.print(i+" ");
          }
        }
        return;
       }
        list.add(arr[idx]);
        sub(idx+1,list,sum-arr[idx],arr);
        list.remove(list.size()-1);
        sub(idx+1,list,sum,arr);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        sub(0, list, sum, arr);
    }
    
}
