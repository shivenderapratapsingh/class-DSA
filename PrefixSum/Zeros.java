package PrefixSum;

public class Zeros {
    public static void array1(int [] arr){
        int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        

    }
    public static void main(String[] args) {
        int [] arr={0,1,1,0,1,0};
        array1(arr);
    }
}
