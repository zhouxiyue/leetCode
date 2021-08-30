public class q57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] re = new int[2];
        while(left<right){
            if(nums[left]+nums[right]==target){
                re[0]=nums[left];
                re[1]=nums[right];
                return re;
            }else if(nums[left]+nums[right]<target)
                left++;
            else
                right--;

        }
        return re;
    }
}
