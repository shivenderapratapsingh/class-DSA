package BinarySearch;

public class distributechocolate {
    static boolean isdivisionposs(int []a,int m,int maxchoco){
        int numofStudents=1;
        int choc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxchoco) return false;
            if(choc+a[i]<=maxchoco){
                choc+=a[i];
            }
            else{
                numofStudents++;
                choc=a[i];
            }
        }
       return numofStudents<=m;
    }
    static int distribchoco(int [] a,int m){
        if(a.length<m) return -1;
        int ans=0 ,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            // such that none of the student receives more than m chocolates
            // there are no more than m student if mid is kept as maximum chocolates aloowend for studen
            if(isdivisionposs(a,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a={5,3,1,4,2};
        int m=3;
        System.out.println(distribchoco(a,m));
    }
}
