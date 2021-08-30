public class q279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=1;i<n+1;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[dp.length-1];
    }


    public int numSquares1(int n) {
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) {
        int n=12;
        q279 q279 = new q279();
        q279.numSquares(n);
    }
}
