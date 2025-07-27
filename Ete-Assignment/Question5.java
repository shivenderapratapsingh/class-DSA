public class Question5 {
    public static int majority(int [] arr){
        int cnt=0;
        int element=-1;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                cnt++;
                element=arr[i];
            }
            else if(element==arr[i]) cnt++;
            else{
                cnt--;
            }
        }
        int count=0;
        for(int i:arr){
            if(i==element){
                count++;
            }
        }
        if(count>arr.length/2) return element;
        return -1;
    }
}
