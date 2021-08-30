public class q47 {
    public int maxValue(int[][] grid) {
        if(grid.length==0||grid[0].length==0)
            return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=1;i<dp.length;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<dp[0].length;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    public static void main(String[] args) {
        q47 q47 = new q47();
        q47.maxValue(new int[][]{{1,2,5},{3,2,1}});
    }
}
