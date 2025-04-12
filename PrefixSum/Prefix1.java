package PrefixSum;

public class Prefix1 {
    public static void prefix1(int [] arr){
        int a=arr.length;
        int [] prefix=new int[a];
        for(int i=0;i<a;i++){
            if(i==0){
                prefix[i]=arr[i];
            }
            else{
                arr[i]=arr[i-1]+arr[i];
            }
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        prefix1(arr);
    }
}
