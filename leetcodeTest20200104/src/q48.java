public class q48 {
    public void rotate(int[][] matrix) {
        if(matrix.length==0)
            return;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=tmp;
            }
        }
    }
}
