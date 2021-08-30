public class q46$$$ {
    private int re;
    public int translateNum(int num) {
        re=0;
        dfs(String.valueOf(num),0);
        return re;
    }

    public void dfs(String num,int index){
        if(index>=num.length()-1){
            re++;
            return;
        }
        dfs(num,index+1);
        if(index<num.length()-1&&(num.charAt(index)=='1')||(num.charAt(index)=='2'&&
                num.charAt(index+1)>='0'&&num.charAt(index+1)<'6')){
            dfs(num,index+2);
        }
    }


    public int translateNum1(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i-1)=='0')||s.substring(i-1,i+1).compareTo("25")>0){
                dp[i+1]=dp[i];
            }else{
                dp[i+1]=dp[i]+dp[i-1];
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        q46$$$ q46 = new q46$$$();
        q46.translateNum1(12258);
    }
}
