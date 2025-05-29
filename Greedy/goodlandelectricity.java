public class goodlandelectricity {
    public static int good(int [] arr,int k){
        int n=arr.length-1;
       int old=-1;
       int current=k-1;
       int max_reach=-1;
       int cnt=0;
       while(max_reach <=n){
        if(max_reach==n) return cnt;
        if(arr[current]==1){
            old=current;
            current+=(k-1)+(k-1)+1;
            max_reach=old+k-1;
            cnt++;
        }
        else{
            for(int i=current;i>=old;i--){
                if(arr[i]==1){
                    if(i==old) return -1;
                    old=current;
                    current+=(k-1)+(k-1)+1;
                    max_reach=old+k-1;
                    cnt++;
                }
            }
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = good(arr, k);
        System.out.println(result);
        
    }
}
