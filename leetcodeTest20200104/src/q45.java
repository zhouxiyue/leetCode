public class q45 {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[0]>nums.length-1)
            return 1;
        int jump=0;
        int maxposition=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            maxposition=Math.max(maxposition,nums[i]+i);
            if(end==i){
                end=maxposition;
                jump++;
            }
        }
        return jump-1;
    }

    public static void main(String[] args) {
        q45 q45 = new q45();
        q45.jump(new int[]{2,3,1,1,4});
    }
}
