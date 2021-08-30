public class q287 {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast){
                fast=0;
                while(nums[fast]!=nums[slow]){
                    fast=nums[fast];
                    slow=nums[slow];
                }
                return nums[fast];
            }
        }
    }

    public int findDuplicate1(int[] nums) {
        for(int i=0;i<nums.length;i++){
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

    public static void main(String[] args) {
        q287 q287 = new q287();
        q287.findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1});
    }
}
