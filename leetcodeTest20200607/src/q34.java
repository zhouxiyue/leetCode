public class q34 {
    public int[] searchRange(int[] nums, int target) {
        int[] re = {-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>=target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        if(nums[left]!=target){
            return re;
        }
        int index1=left;
        right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<=target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        if(nums[left]!=target){
            return re;
        }
        int index2=right;
        return new int[]{index1,index2};
    }
}
