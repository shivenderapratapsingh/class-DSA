package Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comibination2 {
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        findsum(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }

    public static void findsum(int idx,int target,int [] arr,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            findsum(i+1,target-arr[i],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}
