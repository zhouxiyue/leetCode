import java.util.Map;

public class q11 {
    public int maxArea(int[] height) {
        if(height.length==0)return 0;
        int left=0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            int m = (right-left)* Math.min(height[left],height[right]);
            max = Math.max(m,max);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}
