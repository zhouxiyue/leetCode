public class q12 {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if(board.length==0||board[0].length==0)
            return false;
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,i,j,0,word))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,int m,int n,int index,String word){
        if(m<0||n<0||m>=board.length||n>=board[0].length||board[m][n]!=word.charAt(index)||visited[m][n])
            return false;
        if(index==word.length()-1)
            return true;
        visited[m][n]=true;
        boolean re = dfs(board,m+1,n,index+1,word)||
                dfs(board,m-1,n,index+1,word)||
                dfs(board,m,n+1,index+1,word)||
                dfs(board,m,n-1,index+1,word);
        if(!re)
            visited[m][n]=false;
        return re;
    }
}
