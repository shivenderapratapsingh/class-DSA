package Striver;

public class reversearray {
    public static void rev(int l,int r,int [] arr){
        if(l>=r) return;
        swap(arr,l,r);
        rev(l+1, r-1, arr);

    }

    public static void rev2(int i,int [] arr,int n){
        if(i>=arr.length/2) return;
        swap(arr, i, n-i-1);
        rev2(i+1,arr,n);
    }
        public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        int [] arr={12,3,4,2,5};
        int n=arr.length;
        rev2(0,arr,n);
        for(int i:arr){
            System.out.print(i);
        }
    }
    
}
