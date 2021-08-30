public class q14$$$ {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                dp[j]=Math.max(dp[j],dp[j-i]*i);
            }
        }
        return dp[dp.length-1];
    }

    public int cuttingRope2(int n){
        if(n==1||n==2)
            return 1;
        if(n==3)
            return 2;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],dp[i-j]*j);
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        q14$$$ q14$$$ = new q14$$$();
        q14$$$.cuttingRope(10);
    }
}
