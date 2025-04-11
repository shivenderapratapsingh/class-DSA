package BitManipulation;

public class CheckNoIsEven {
    static boolean isEven(int n) {
        // code here
        int a= n^1;
        if( a>n){
            return true;
        }
        
        return false;
    }
}
