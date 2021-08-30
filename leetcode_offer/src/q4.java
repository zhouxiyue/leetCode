public class q4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int m=0;
        int n=matrix[0].length-1;
        while(m<=matrix.length-1&&n>=0){
            if(matrix[m][n]==target)
                return true;
            else if(matrix[m][n]<target)
                m++;
            else
                n--;
        }
        return false;
    }
}
