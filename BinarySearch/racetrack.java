package BinarySearch;

public class racetrack {
    static boolean isPossible(int [] a,int k,int dist){
        int kidsplaced=1;
        int lastkid=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastkid >=dist){
                kidsplaced++;
                lastkid=a[i];
            }
        }
        if(kidsplaced>=k) return true;
        return false;
    }
    static int racet(int [] a,int k){
        if(k>a.length) return -1;
        int st=1 ,end=(int)1e9;
        int ans=1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(a,k,mid)){// can k kids be placed such that no 2 kids have distance lesser than mid
                ans=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] a={1,2,4,8,9};
        int k=3;
        System.out.println(racet(a, k));
    }
}
