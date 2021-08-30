public class q33 {
    public int search(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]<nums[right]){//右半段有序
                if(nums[middle]<target&&nums[right]>=target){//判断target是否可能在右半段
                    left=middle+1;
                }else{
                    right=middle-1;
                }
            }else{//左半段有序
                if(nums[left]<=target&&nums[middle]>target){//判断target是否有可能在左半段
                    right=middle-1;
                }else{
                    left=middle+1;
                }
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target) {
        if(nums.length==0)
            return -1;
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            if(nums[middle]==target)
                return middle;
            else if(nums[middle]<nums[right]){
                if(nums[middle]<target&&nums[right]>=target)
                    left=middle+1;
                else
                    right=middle-1;
            }else{
                if(nums[left]<=target&&nums[middle]>target)
                    right=middle-1;
                else
                    left=middle+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        q33 q33 = new q33();
        int[] nums={1,3};
        int target=3;
        q33.search(nums,target);
    }
}
