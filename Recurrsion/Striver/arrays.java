package Striver;

public class arrays {
    public static void arrange(int [] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]%2!=0 && arr[high]%2!=0)
            {
                high--;
            }
            else if(arr[low]%2==0 && arr[high]%2==0){
                low++;
            }
            else if(arr[low]%2!=0 && arr[high]%2==0){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
            else{
                low++;
                high--;
            }
        }
       
    }
    public static void main(String[] args) {
        int [] arr={2,9,5,3,7,6};
         arrange(arr);
        for(int i:arr){
            System.out.print(i);
        }

    }
}
