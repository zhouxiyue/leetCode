import java.util.Arrays;

public class q49 {
    public int nthUglyNumber(int n) {
        if(n==1)
            return 1;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int[] dp = new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=Math.min(Math.min(dp[p1]*2,dp[p2]*3),dp[p3]*5);
            if(dp[i]==dp[p1]*2) {
                p1++;
            }
            if(dp[i]==dp[p2]*3) {
                p2++;
            }
            if(dp[i]==dp[p3]*5) {
                p3++;
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        q49 q49 = new q49();
        System.out.println(q49.nthUglyNumber(10));
    }
}
