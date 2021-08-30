import java.util.*;

public class q322 {
    Set<List<Integer>> re;
    public int coinChange(int[] coins, int amount) {
        re= new HashSet<>();
        dfs(coins,0,amount,new ArrayList<>());
        Iterator iterator = re.iterator();
        int min=Integer.MAX_VALUE;
        while(iterator.hasNext()){
            ArrayList<Integer> li = (ArrayList<Integer>)iterator.next();
            if(min>li.size())
                min=li.size();
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public void dfs(int[] coins,int index,int amount,List<Integer> list){
        if(amount==0){
            re.add(new ArrayList<>(list));
            return;
        }
        if(amount<0)
            return;
        for(int i=index;i<coins.length;i++){
            list.add(coins[i]);
            dfs(coins,i,amount-coins[i],list);
            list.remove(list.size()-1);
        }
    }
}

class q322_1{
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[dp.length-1]==amount+1?-1:dp[dp.length-1];
    }



    public static void main(String[] args) {
        int[] coins=new int[]{2,3,5};
//        q322_1 q322_1 = new q322_1();
//        q322_1.coinChange(coins,11);
        q322 q322 = new q322();
        q322.coinChange(coins,8);
    }
}
