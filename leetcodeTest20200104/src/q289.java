public class q289 {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(cal(board,i,j)==-1){
                    board[i][j]=-1;
                }else if(cal(board,i,j)==-2){
                    board[i][j]=-2;
                }else{
                    continue;
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==-1)
                    board[i][j]=0;
                else if(board[i][j]==-2)
                    board[i][j]=1;
            }
        }
    }

    public int cal(int[][] board,int m,int n){
        int num=0;
        int left = Math.max(0,n-1);
        int right = Math.min(board[0].length-1,n+1);
        int top = Math.max(0,m-1);
        int bottom = Math.min(board.length-1,m+1);
        for(int i=top;i<=bottom;i++){
            for(int j=left;j<=right;j++){
                if(i==m&&j==n)
                    continue;
                if(board[i][j]==1||board[i][j]==-1)
                    num++;
            }
        }
        if(board[m][n]==1&&num<2)
            return -1;
        if(board[m][n]==1&&num>=2&&num<=3)
            return 1;
        if(board[m][n]==1&&num>3)
            return -1;
        if(board[m][n]==0&&num==3)
            return -2;
        return 0;
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{{0,0,0,0,0,0},
                {0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},
                {0,0,0,0,0,0},{0,0,0,0,0,0}};
        q289 q289 = new q289();
        q289.gameOfLife(board);
    }
}
