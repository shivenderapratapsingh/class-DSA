package BitManipulation;

public class CountNoBits {
    public static int solution(int n){
        int count=0;
        while(n>1){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        if(n==1) count++;
        return count;
    }
}
