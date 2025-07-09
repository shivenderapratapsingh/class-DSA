import java.util.*;

public class Question17 {
    public static List<List<Integer>> yo(int [] nums,int target){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        recursive(0,nums,target,ds,ans);
        return ans;


    }
    public static void recursive(int idx,int [] nums,int target,List<Integer> ds,List<List<Integer>> ans){
        if(idx==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            } 
            return;
        }

        if(nums[idx]<=target){
            ds.add(nums[idx]);
            recursive(idx, nums, target-nums[idx], ds, ans);
            ds.remove(ds.size()-1);
        }
        recursive(idx+1,nums,target,ds,ans);
        

    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = yo(nums, target);
        System.out.println(result);
    }
    
}
