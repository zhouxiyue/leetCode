public class q42 {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int re = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            re = Math.max(re+nums[i],nums[i]);
            max = Math.max(re,max);
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        if(nums.length==0)
            return 0;
        int re = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(re+nums[i]<nums[i])
                re=nums[i];
            else{
                re+=nums[i];
            }
            max = Math.max(re,max);
        }
        return max;
    }
}
