public class q200 {
    public int numIslands(char[][] grid) {
        if(grid.length==0||grid[0].length==0)
            return 0;
        int m=grid.length;
        int n=grid[0].length;
        int re=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(grid,i,j)){
                    re++;
                }
            }
        }
        return re;
    }

    public boolean dfs(char[][] grid,int m,int n){
        if(m<0||n<0||m>=grid.length||n>=grid[0].length)
            return true;
        if(grid[m][n]=='0')
            return false;
        if(grid[m][n]=='1'){
            grid[m][n]='0';
            dfs(grid,m+1,n);
            dfs(grid,m-1,n);
            dfs(grid,m,n+1);
            dfs(grid,m,n-1);
        }
        return true;
    }

    public static void main(String[] args) {
        q200 q200 = new q200();
        q200.numIslands(new char[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}});
    }
}
