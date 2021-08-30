import java.util.Arrays;

public class q204 {
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim,true);
        for(int i=2;i*i<n;i++){
            if(isPrim[i]){
                for(int j=i*i;j<n;j+=i)
                    isPrim[j]=false;
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrim[i])
                count++;
        }
        return count;
    }

    public int countPrimes1(int n) {
        boolean[] dp = new boolean[n];
        Arrays.fill(dp,true);
        int re=0;
        for(int i=2;i<n;i++){
            if(dp[i]){
                for(int j=i*2;j<n;j+=i){
                    dp[j]=false;
                }
            }
        }
        for(int i=2;i<dp.length;i++){
            if(dp[i])
                re++;
        }
        return re;
    }

    public static void main(String[] args) {
        q204 q204 = new q204();
        q204.countPrimes(10);
    }
}
