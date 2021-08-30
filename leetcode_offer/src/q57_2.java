import java.util.ArrayList;
import java.util.List;

public class q57_2 {
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = left+1;
        int sum=0;
        List<int[]> re = new ArrayList<>();
        while(left<right){
            sum=(left+right)*(right-left+1)/2;
            if(sum==target){
                int[] li = new int[right-left+1];
                int index=0;
                for(int i=left;i<=right;i++){
                    li[index]=i;
                    index++;
                }
                re.add(li);
                left++;
            }else if(sum>target)
                left++;
            else
                right++;
        }
        int[][] result = new int[re.size()][];
        for(int i=0;i<re.size();i++){
            result[i] = re.get(i);
        }
        return result;
    }
}
