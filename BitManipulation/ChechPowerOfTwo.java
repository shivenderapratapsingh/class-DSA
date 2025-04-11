package BitManipulation;

public class ChechPowerOfTwo {
    public static boolean power(int n){
        return ((n & n-1)==0)?true:false;
    }
}
