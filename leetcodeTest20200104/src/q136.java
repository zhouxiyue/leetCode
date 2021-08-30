public class q136 {
    public int singleNumber(int[] nums) {
        int re=nums[0];
        for(int i=1;i<nums.length;i++){
            re^=nums[i];
        }
        return re;
    }
}
