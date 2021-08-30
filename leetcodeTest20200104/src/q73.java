import java.util.ArrayList;
import java.util.List;

public class q73 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(row.contains(i)||col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public void setZeroes1(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(m==0||n==0)
            return;
        boolean flag=false;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0)
                flag=true;
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(flag){
                matrix[i][0]=0;
            }
        }
    }
}
