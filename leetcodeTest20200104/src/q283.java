public class q283 {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1)
            return;
        if(nums.length==2){
            if(nums[0]==0){
                int tmp = nums[0];
                nums[0]=nums[1];
                nums[1]=tmp;
            }
            return;
        }
        int index1=0;
        int index2=0;
        while(index2<=nums.length-1&&index1<=nums.length-1) {
            if (nums[index2] == 0)
                index2++;
            if (nums[index1] != 0)
                index1++;
            if(index2>nums.length-1)
                return;
            swap(nums, index1, index2);
        }
    }

    public void swap(int[] nums,int index1,int index2){
        int tmp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=tmp;
    }

    public void moveZeroes1(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int tmp = nums[i];
                nums[i]=nums[index];
                nums[index]=tmp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        q283 q283 = new q283();
        q283.moveZeroes1(new int[]{0,0,0,0,1,2,3,4,5,6});
    }
}
