public class Question1 {
    public static int sumArr(int [] arr,int l,int r){
        int ans=0;
        int [] pref=new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        ans=pref[r]-pref[l-1];
        // The sum of elements from index l to r is given by pref[r] - pref[l-1]
        return ans;


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int l=1;
        int r=3;
        System.out.println(sumArr(arr,l,r));
        // Output: 6 (sum of elements from index 1 to 3 is 2+3+4=9)
    }
}
