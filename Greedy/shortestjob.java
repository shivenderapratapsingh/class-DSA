import java.util.Arrays;

public class shortestjob {
    
     static int solve(int bt[]) {
        int sum = 0;
        Arrays.sort(bt);
        for (int i = 0; i < bt.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += bt[j];
            }
        }
        int ans = sum / bt.length;
        return ans;
    }
}
