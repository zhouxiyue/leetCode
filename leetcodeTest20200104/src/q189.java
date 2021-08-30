public class q189 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        help(nums,0,nums.length-1);
        help(nums,0,k-1);
        help(nums,k,nums.length-1);
    }

    public void help(int[] nums,int left,int right){
        while(left<right){
            int tmp = nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
            left++;
            right--;
        }
    }
}
