public class Question19 {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int lp=1;
        int rp=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            lp= lp==0 ? 1 : lp;
            rp= rp==0 ? 1 : rp;
            lp*=nums[i];
            rp*=nums[n-i-1];
            ans=Math.max(ans,Math.max(lp,rp));
        }
        return ans;
    }
}
