public class q29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0)
            return new int[0];
        int row = matrix.length;
        int col = matrix[0].length;
        int num=row*col;
        int[] result = new int[num];
        int n=0;
        int left=0;
        int right=col-1;
        int top = 0;
        int bottom=row-1;
        while(n<num){
            for (int i = left; i <= right; i++) {
                if(n>=num)
                    return result;
                result[n] = matrix[top][i];
                n++;

            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(n>=num)
                    return result;
                result[n]=matrix[i][right];
                n++;
            }
            right--;
            for(int i=right;i>=left;i--){
                if(n>=num)
                    return result;
                result[n]=matrix[bottom][i];
                n++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(n>=num)
                    return result;
                result[n]=matrix[i][left];
                n++;
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1}};
        q29 q29 = new q29();
        q29.spiralOrder(matrix);
    }
}
