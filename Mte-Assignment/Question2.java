public class Question2 {
    public static int pivot(int [] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        int pref=0;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(sum==pref) return i;
            pref+=arr[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr={1,7,3,6,5,6};
        System.out.println(pivot(arr)); // 3
        int [] arr2={1,2,3};
        System.out.println(pivot(arr2)); // -1
        int [] arr3={2,1,-1};
        System.out.println(pivot(arr3)); // 0
        
    }
}
