public class q122 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int re=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i]>0)
                re+=prices[i+1]-prices[i];
        }
        return re;
    }
}
