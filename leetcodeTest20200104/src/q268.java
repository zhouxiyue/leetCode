public class q268 {
    public int missingNumber(int[] nums) {
        int sum=0;
        int i=0;
        for(;i<nums.length;i++){
            sum+=nums[i]-i;
        }
        sum-=i;
        return Math.abs(sum);
    }
}
