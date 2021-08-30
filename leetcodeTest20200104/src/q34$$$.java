public class q34$$$ {
    public int[] searchRange(int[] nums, int target) {
        int[] re = {-1,-1};
        if(nums.length==0)return re;
        int left=0;
        int right = nums.length-1;
        while(left<right){
            int middle = (left+right)/2;
            if(nums[middle]>=target){
                right=middle;
            }else{
                left=middle+1;
            }
        }
        if(nums[left]!=target)return re;
        re[0]=left;
        right=nums.length;
        while(left<right){
            int middle = (left+right)/2;
            if(nums[middle]<=target){
                left=middle+1;
            }else{
                right=middle;
            }
        }
        if(nums[left-1]!=target)return re;
        re[1]=left-1;
        return re;
    }

    public static void main(String[] args) {
        q34$$$ q34 = new q34$$$();
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        q34.searchRange(nums,target);
    }
}
