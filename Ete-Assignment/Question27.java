import java.util.ArrayList;
import java.util.List;



public class Question27 {
      public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, res, subset);
        return res;        
    }
    public static void createSubset(int[] nums,int idx,List<List<Integer>> res,List<Integer> sub){
        if(idx==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[idx]);
        createSubset(nums, idx+1, res, sub);
        sub.remove(sub.size()-1);
        createSubset(nums, idx+1, res, sub);
    }
}
