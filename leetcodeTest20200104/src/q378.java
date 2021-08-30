public class q378 {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = matrix[0][0];
        int right = matrix[row-1][col-1];
        while(left<right){
            int mid = (left+right)/2;
            int count = count(matrix,mid,row,col);
            if(count<k){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right;
    }

    public int count(int[][] matrix,int mid,int row,int col){
        int i=row-1;
        int j=0;
        int count=0;
        while(i>=0&&j<col){
            if(matrix[i][j]<=mid){
                count+=i+1;
                j++;
            }else{
                i--;
            }
        }
        return count;
    }
}
