import java.util.Arrays;

public class q334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small>=nums[i])
                small = nums[i];
            else if(mid>=nums[i])
                mid=nums[i];
            else if(mid<nums[i])
                return true;
        }
        return false;
    }

    public boolean increasingTriplet1(int[] nums) {
        if(nums.length<3)
            return false;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                if(dp[i]==3)
                    return true;
            }
        }
        return false;
    }
}
