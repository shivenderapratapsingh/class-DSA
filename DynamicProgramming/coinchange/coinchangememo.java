package CoinChange;

public class coinchangememo {
      public static int count(int coins[], int sum) {
       int [][] memo=new int [coins.length+1][sum+1];
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= sum; j++) {
                memo[i][j] = -1; 
            }
        }
         return countRec(coins,coins.length,sum,memo);
       
        
    }

    private static int countRec( int coins[], int n, int sum,int[][] memo) {
        if (sum == 0) return 1;
        if (n == 0) return 0;
        if (sum < 0) return 0;
        if(memo[n][sum]!=-1){
            return memo[n][sum];
        }
        
        int count1=countRec(coins, n - 1, sum,memo);
        int count2= countRec(coins, n, sum - coins[n - 1],memo);
        memo[n][sum]=count1+count2;
        return memo[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println("Number of ways to make change: " + count(coins, sum));
    }
}
