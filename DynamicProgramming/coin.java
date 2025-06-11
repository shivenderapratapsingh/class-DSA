public class coin {
    public class CoinChange {

   
    static int[] arr = {1, 2, 3}; 

    public static int fun(int n, int target) {
        if (target == 0) return 1;    
        if (n == 0) return 0;          
        if (target < 0) return 0;    

        int pos1 = fun(n, target - arr[n - 1]); 
        int pos2 = fun(n - 1, target);         

        return pos1 + pos2;
    }

    public static void main(String[] args) {
        int target = 4;
        int n = arr.length;
        int ways = fun(n, target);
        System.out.println("Total ways to make " + target + " = " + ways);
    }
}
    
}
