import java.util.ArrayList;
import java.util.List;

public class q36 {
    public boolean isValidSudoku(char[][] board) {
        if(board.length==0||board[0].length==0)return false;

        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'1';
                    int blockindex = i/3*3+j/3;
                    if(row[i][num]||col[j][num]||block[blockindex][num]){
                        return false;
                    }else{
                        row[i][num]=true;
                        col[j][num]=true;
                        block[blockindex][num]=true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(2/3);
        System.out.println('2'-'3');
    }
}
