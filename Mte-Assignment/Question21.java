public class Question21 {
    static int setBits(int n) {
        // code here
        int count=0;
        while(n!=0){
            n=n & (n-1);
            count++;
        }
        return count;
        
    }
}
