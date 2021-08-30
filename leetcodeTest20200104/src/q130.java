public class q130 {
    public void solve(char[][] board) {
        if(board.length==0||board[0].length==0)
            return;
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O')
                dfs_1(board,i,0);
            if(board[i][n-1]=='O')
                dfs_1(board,i,n-1);
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O')
                dfs_1(board,0,j);
            if(board[m-1][j]=='O')
                dfs_1(board,m-1,j);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dfs_2(board,i,j);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='S')
                    board[i][j]='O';
            }
        }
    }

    public void dfs_1(char[][] board,int m,int n){
        if(m>=board.length||n>=board[0].length||m<0||n<0)
            return;
        if(board[m][n]!='O')
            return;
        board[m][n]='S';
        dfs_1(board,m+1,n);
        dfs_1(board,m-1,n);
        dfs_1(board,m,n+1);
        dfs_1(board,m,n-1);
    }

    public void dfs_2(char[][] board,int m,int n){
        if(m>=board.length-1||n>=board[0].length-1 ||m<=0||n<=0)
            return;
        if(board[m][n]!='O')
            return;
        board[m][n]='X';
        dfs_2(board,m+1,n);
        dfs_2(board,m-1,n);
        dfs_2(board,m,n+1);
        dfs_2(board,m,n-1);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'O','O'},{'O','O'}};
        q130 q130 = new q130();
        q130.solve(board);
    }
}

