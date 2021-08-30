public class q13 {
    boolean[][] visited;
    int result=0;
    int row;
    int col;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        row=m-1;
        col=n-1;
        dfs(0,0,k);
        return result;
    }

    public void dfs(int m,int n,int k){
        if(m<0||n<0||m>row||n>col||visited[m][n])
            return;
        visited[m][n]=true;
        if(!check(m,n,k))
            return;
        result++;
        dfs(m+1,n,k);
        dfs(m-1,n,k);
        dfs(m,n+1,k);
        dfs(m,n-1,k);
    }

    public boolean check(int m,int n,int k){
        int re = 0;
        while(m!=0){
            re+=m%10;
            m/=10;
        }
        while(n!=0){
            re+=n%10;
            n/=10;
        }
        return re<=k;
    }

    public static void main(String[] args) {
        q13 q13 = new q13();
        System.out.println(q13.check(35, 37, 18));
    }
}
