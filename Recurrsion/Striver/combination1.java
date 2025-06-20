package Striver;
import java.util.ArrayList;
import java.util.List;

public class combination1 {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findsub(0,candidates,target,ans,list);
        return ans;
    }
    public static void findsub(int idx,int [] arr,int target,List<List<Integer>> ans,List<Integer> list){
        if(idx==arr.length){
            if(target==0){
            ans.add(new ArrayList<>(list));
        }
            return;
        }
       
        if(arr[idx]<=target){
            list.add(arr[idx]);
            findsub(idx,arr,target-arr[idx],ans,list);
            list.remove(list.size()-1);
        }
        findsub(idx+1,arr,target,ans,list);
    }
}
