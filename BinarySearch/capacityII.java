package BinarySearch;

import java.util.Arrays;

public class capacityII {
        public static int daysreq(int [] arr,int capacity){
        int days=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=capacity){
                days+=1;
                sum=arr[i];
            }

        }
        return days;


    }
    public int shipWithinDays(int[] weights, int days) {
       Arrays.sort(weights);
       int a=weights.length-1;
       //prefix sum
       int pref=0;
       for(int i=0;i<=a;i++){
        pref+=weights[i];
       }
       int d=weights[0];
       int e=pref;
       int ans=0;
       for(int i=d;i<=e;i++){
        int h=daysreq(weights,i);
        if(h==days){
            ans=i;
            break;
        }
        
       }
       return ans;
    }
}
