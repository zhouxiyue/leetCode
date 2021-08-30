public class q162 {
    public int findPeakElement(int[] nums) {
        return search(nums,0,nums.length-1);
    }

    public int search(int[] nums,int left,int right){
        if(left==right)
            return left;
        int mid = (left+right)/2;
        if(nums[mid]>nums[mid+1]){
            return search(nums,left,mid);
        }else{
            return search(nums,mid+1,right);
        }
    }
}

class q162_1{
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
