public class q26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        int left = 0;
        int right = 1;
        while(right<nums.length){
            if(nums[left]==nums[right]){
                right++;
            }else{
                left++;
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                right++;
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        q26 q26 = new q26();
        q26.removeDuplicates(nums);
    }
}
