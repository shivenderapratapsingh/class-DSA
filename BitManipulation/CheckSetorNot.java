package BitManipulation;

public class CheckSetorNot {
    static boolean checkKthBit(int n, int k) {
        boolean a=((n & (1<<k))!=0)?true:false;
        return a;
        
    }
}
