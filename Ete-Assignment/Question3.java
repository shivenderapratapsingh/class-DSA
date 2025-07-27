public class Question3 {
    public static boolean split(int [] arr){
        int left=0;
        int sum=0;
        for(int i:arr){
            sum+=i;

        }
        for(int i=0;i<arr.length;i++){
            left+=arr[i];
            if(left==sum-left){return true;}

        }
        return false;
    }
    
}
