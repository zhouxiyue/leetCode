import java.util.ArrayList;
import java.util.List;

public class q212 {
    boolean[][] visited;
    public List<String> findWords(char[][] board, String[] words) {
        List<String> list = new ArrayList<>();
        if(board.length==0||board[0].length==0)
            return list;
        int m=board.length;
        int n=board[0].length;
        boolean[] w = new boolean[words.length];
        for(int i=0;i<words.length;i++){
            visited=new boolean[m][n];
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(dfs(words[i],0,board,j,k)){
                        w[i]=true;
                    }
                }
            }
        }
        for(int i=0;i<w.length;i++){
            if(w[i])
                list.add(words[i]);
        }
        return list;
    }

    public boolean dfs(String word,int index,char[][] board,int m,int n){
        if(index==word.length())
            return true;
        if(m<0||n<0||m>=board.length||n>=board[0].length)
            return false;
        boolean re=false;
        if(board[m][n]==word.charAt(index)&&!visited[m][n]){
            visited[m][n]=true;
             re = dfs(word,index+1,board,m+1,n)||
                    dfs(word,index+1,board,m-1,n)||
                    dfs(word,index+1,board,m,n+1)||
                    dfs(word,index+1,board,m,n-1);
            if(!re)
                visited[m][n]=false;
        }
        return re;
    }

    public boolean dfs1(String word,int index,char[][] board,int m,int n){
        if(index==word.length())
            return true;
        if(m<0||m>=board.length||n<0||n>=board[0].length||board[m][n]!=word.charAt(index)||visited[m][n])
            return false;
        visited[m][n]=true;
        boolean re = dfs1(word,index+1,board,m+1,n)||
                dfs1(word,index+1,board,m-1,n)||
                dfs1(word,index+1,board,m,n+1)||
                dfs1(word,index+1,board,m,n-1);
        if(!re)
            visited[m][n]=false;
        return re;
    }
}
