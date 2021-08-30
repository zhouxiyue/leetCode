public class q121 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int[] dp = new int[prices.length];
        int min = prices[0];
        dp[0]=0;
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-min);
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return dp[dp.length-1];
    }

    public int maxProfit1(int[] prices) {
        if(prices.length==0)
            return 0;
        int max = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            if(max<prices[i]-min){
                max=prices[i]-min;
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        q121 q121 = new q121();
        q121.maxProfit(new int[]{7,1,5,3,6,4});
    }
}
