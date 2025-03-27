package BinarySearch;
public class capacity {
    public static int days(int [] arr,int capacity){
        int sum=0;
        int days=0;
          for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=capacity){
                days+=1;
                sum=arr[i];
            }
            
          }
          return days;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=10;i<=55;i++){
            int a=days(arr, i);
            System.out.println("No of days:"+a);

        }
        
        
    }
    
}
