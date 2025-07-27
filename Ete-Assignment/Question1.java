
public class Question1 {
    public static int prefix(int [] arr,int l,int r){
        int [] pref=new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref[r]-pref[l-1];
    }
    
}
