public class q75 {
    public void sortColors(int[] nums) {
        sort(nums,0,nums.length-1);
    }

    public void sort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int baseval = nums[left];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r&&nums[r]>=baseval)
                r--;
            if(l<r){
                nums[l]=nums[r];
                l++;
            }
            while(l<r&&nums[l]<baseval)
                l++;
            if(l<r){
                nums[r]=nums[l];
                r--;
            }
        }
        nums[l]=baseval;
        sort(nums,left,l-1);
        sort(nums,l+1,right);
    }
}
