public class q79 {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if(word.length()==0)
            return true;
        int m=board.length;
        int n=board[0].length;
        if(m==0||n==0)
            return false;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,int i,int j,int index,String word){
        if(index==word.length())
            return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length)
            return false;
        boolean re=false;
        if(word.charAt(index)==board[i][j]&&!visited[i][j]){
            visited[i][j]=true;
            re = dfs(board,i+1,j,index+1,word)||
                    dfs(board,i-1,j,index+1,word)||
                    dfs(board,i,j+1,index+1,word)||
                    dfs(board,i,j-1,index+1,word);
            if(!re)
                visited[i][j]=false;
        }
        return re;
    }

    public boolean dfs1(char[][] board,int i,int j,int index,String word){
        if(index==word.length())
            return true;
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||
                board[i][j]!=word.charAt(index)||visited[i][j])
            return false;
        visited[i][j]=true;
        boolean re = dfs1(board,i+1,j,index+1,word)||
                dfs1(board,i-1,j,index+1,word)||
                dfs1(board,i,j+1,index+1,word)||
                dfs1(board,i,j-1,index+1,word);
        if(!re){
            visited[i][j]=false;
        }
        return re;
    }
}
