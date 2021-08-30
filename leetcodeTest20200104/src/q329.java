public class q329 {
    int len = 0;
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return len;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dfs(matrix,i,j,Integer.MIN_VALUE,0);
            }
        }
        return len==0?1:len;
    }

    public void dfs(int[][] matrix,int m,int n,int lastnum,int num){
        if(m<0||n<0||m>=matrix.length||n>=matrix[0].length)
            return;
        if(matrix[m][n]>lastnum){
            num++;
            if(len<num)
                len=num;
            dfs(matrix,m+1,n,matrix[m][n],num);
            dfs(matrix,m-1,n,matrix[m][n],num);
            dfs(matrix,m,n+1,matrix[m][n],num);
            dfs(matrix,m,n-1,matrix[m][n],num);
        }
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2},{4,3}};
        q329 q329 = new q329();
        q329.longestIncreasingPath(nums);
    }
}

class q329_1{
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return 0;
        int re = 0;
        int[][] ma = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                re = Math.max(re,dfs(matrix,i,j,Integer.MIN_VALUE,ma));
            }
        }
        return re;
    }

    public int dfs(int[][] matrix,int m,int n,int lastnum,int[][] ma){
        if(m<0||n<0||m>=matrix.length||n>=matrix[0].length||matrix[m][n]<=lastnum)
            return 0;
        if(ma[m][n]!=0)
            return ma[m][n];
        int re=0;
        if(matrix[m][n]>lastnum) {
            re = Math.max(re, dfs(matrix, m + 1, n, matrix[m][n], ma));
            re = Math.max(re, dfs(matrix, m - 1, n, matrix[m][n], ma));
            re = Math.max(re, dfs(matrix, m, n + 1, matrix[m][n], ma));
            re = Math.max(re, dfs(matrix, m, n - 1, matrix[m][n], ma));
            ma[m][n] = re + 1;
        }
        return ma[m][n];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        q329_1 q329_1 = new q329_1();
        q329_1.longestIncreasingPath(nums);
    }
}