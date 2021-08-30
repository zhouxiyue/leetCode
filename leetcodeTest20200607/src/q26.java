public class q26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int left = 0;
        int right = 1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }else{
                left++;
                int tmp = nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                right++;
            }
        }
        return left+1;
    }
}
