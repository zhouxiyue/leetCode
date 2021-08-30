public class q1 {
    public int[] twoSum(int[] nums, int target) {
        sort(nums,0,nums.length-1);
        int left=0;
        int right=nums.length-1;
        int[] result = new int[2];
        while(left<right){
            if(nums[left]+nums[right]==target){
                result[0]=left;
                result[1]=right;
                return result;
            }else if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }

    public void sort(int[] nums,int left ,int right){
        if(left>=right)return;
        int l=left,r=right;
        int baseval = nums[left];
        while(l<r){
            while(l<r&&nums[r]>=baseval){
                r--;
            }
            if(l<r){
                nums[l]=nums[r];
            }
            while(l<r&&nums[l]<baseval){
                l++;
            }
            if(l<r){
                nums[r]=nums[l];
            }
        }
        nums[l]=baseval;
        sort(nums,left,l-1);
        sort(nums,l+1,right);
    }

    public static void main(String[] args) {
        int[] nums={7,3,6,2,4,1,5};
        q1 q1=new q1();
        q1.twoSum(nums,6);
    }
}
