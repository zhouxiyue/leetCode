import java.util.ArrayList;
import java.util.List;

public class q54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0)
            return result;
        int left =0;
        int right = matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        int c=0;
        int num=(right+1)*(bottom+1);
        while(c<num){
            if(c<num&&left<=right) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                    c++;
                }
                top++;
            }
            if(c<num&&top<=bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                    c++;
                }
                right--;
            }
            if(c<num&&left<=right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                    c++;
                }
                bottom--;
            }
            if(c<num&&top<=bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                    c++;
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        q54 q54 = new q54();
        q54.spiralOrder(matrix);
    }
}
