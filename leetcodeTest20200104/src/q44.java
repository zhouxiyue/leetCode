public class q44 {
    public boolean isMatch(String s, String p){
        int ls = s.length();
        int lp = p.length();
        boolean[][] dp = new boolean[ls+1][lp+1];
        dp[0][0]=true;
        for(int i=1;i<=lp;i++){
            if(dp[0][i-1]&&p.charAt(i-1)=='*')
                dp[0][i]=true;
        }
        for(int i=1;i<=ls;i++){
            for(int j=1;j<=lp;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
            }
        }
        return dp[ls][lp];
    }
}
