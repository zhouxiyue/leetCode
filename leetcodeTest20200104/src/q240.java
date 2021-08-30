public class q240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int m=0;
        int n=matrix[0].length-1;

        while(n>=0&&m<=matrix.length-1){
            if(matrix[m][n]==target)
                return true;
            else if(matrix[m][n]>target)
                n--;
            else
                m++;
        }
        return false;
    }
}
