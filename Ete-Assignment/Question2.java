public class Question2 {
    public static int equi(int [] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int pref=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(sum==pref) return i;
            pref+=arr[i];
        }
        return -1;
    }
}
