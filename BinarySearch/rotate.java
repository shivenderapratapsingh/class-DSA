package BinarySearch;

public class rotate {
    public static int [] arr(int [] arr,int k){
        int a=arr.length;
        int [] at=new int [a];
        int rot=k%a;
        if(rot==0){
            return arr;
        }
        int j=0;
        for(int i=rot;i<arr.length;i++){
            at[j++]=arr[i];
        }
        for(int i=0;i<rot;i++){
            at[j++]=arr[i];
        }
        return at;

    }
    public static void main(String[] args) {
        int [] arrt={1,2,3,4,5,6,7};
        int [] a=arr(arrt, 3);
        for(int i:a){
            System.out.print(i);
        }
    }
}
