public class q217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0||nums.length==1)
            return false;
        quicksort(nums,0,nums.length-1);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    public void quicksort(int[] nums,int left,int right){
        if(left>right)
            return;
        int baseval = nums[left];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r&&nums[r]>=baseval){
                r--;
            }
            if(l<r){
                nums[l]=nums[r];
                l++;
            }
            while(l<r&&nums[l]<baseval){
                l++;
            }
            if(l<r){
                nums[r]=nums[l];
                r--;
            }
        }
        nums[l]=baseval;
        quicksort(nums,left,l-1);
        quicksort(nums,l+1,right);
    }
}
