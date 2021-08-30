public class q53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]+sum<nums[i]){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
