
// public class kkk{
//     //using reccursion to find the maximum amount of money that can be robbe
//     public static int rob(int[] nums) {
//         return robHelper(nums, 0);
//     }

//     private static int robHelper(int[] nums, int currentIndex) {
//         if (currentIndex >= nums.length) {
//             return 0;
//         }
//         int robCurrent = nums[currentIndex] + robHelper(nums, currentIndex + 2);
//         int skipCurrent = robHelper(nums, currentIndex + 1);
//         return Math.max(robCurrent, skipCurrent);
//     }
//     public static void main(String[] args) {
//         int[] nums = {2, 7, 9, 3, 1};
//         System.out.println("Maximum amount of money that can be robbed: " + rob(nums));
        
//         int[] nums2 = {1, 2, 3, 1};
//         System.out.println("Maximum amount of money that can be robbed: " + rob(nums2));
        
//         int[] nums3 = {5, 3, 4, 11, 2};
//         System.out.println("Maximum amount of money that can be robbed: " + rob(nums3));
//     }
