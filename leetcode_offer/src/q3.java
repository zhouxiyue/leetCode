public class q3 {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                int tmp = nums[i];
                nums[i]=nums[tmp];
                nums[tmp]=tmp;
            }
        }
        return -1;
    }
}
