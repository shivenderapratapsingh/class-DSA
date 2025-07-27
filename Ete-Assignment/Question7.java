public class Question7 {
    public static int trap(int [] arr){
        int n=arr.length;
        int [] leftmax=getleftmax(arr,n);
        int [] rightmax=getrightmax(arr,n);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }
        return sum;
    }
    public static int [] getleftmax(int [] arr,int n){
        int [] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i]=Math.max(ans[i-1],arr[i]);
        }
        return ans;
    }
    public static int [] getrightmax(int [] arr,int n){
        int [] ans=new int[n];
        ans[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=Math.max(ans[i+1],arr[i]);
        }
        return ans;
    }
}
