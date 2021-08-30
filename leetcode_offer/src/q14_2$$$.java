import java.math.BigInteger;

public class q14_2$$$ {
    public int cuttingRope(int n) {
        BigInteger[] dp = new BigInteger[n+1];
        dp[0] = new BigInteger("1");
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                if(dp[j]==null)
                    dp[j]=new BigInteger("0");
                dp[j]=dp[j].max(dp[j-i].multiply(new BigInteger(String.valueOf(i))));
            }
        }
        return dp[dp.length-1].mod(new BigInteger("1000000007")).intValue();
    }
}
