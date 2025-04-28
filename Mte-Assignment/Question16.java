public class Question16 {
  
        public int majorityElement(int[] nums) {
            int count=0;
            int element=-1;
            for(int i=0;i<nums.length;i++){
                if(count==0){
                    count=1;
                    element=nums[i];
                }
                else if(element==nums[i]) count ++;
                else{
                    count--;
                }
            }
            int ans=0;
            for(int i:nums){
                if(i==element) ans++;
            }
            if(ans>nums.length/2) return element;
            return -1;
        }
    }

