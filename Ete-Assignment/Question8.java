public class Question8 {
    public static int bist(int a){
        int cnt=0;
        while(a!=0){
            a=a&a-1;
            cnt++;

        }
        return cnt;
    }
}
