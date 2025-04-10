package PrefixSum;

public class suffix {
    public static void sufix(int [] arr){
        // int a=arr.length;

        for(int i=arr.length-2;i>=0;i--){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
