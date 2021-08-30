public class q238 {
    public int[] productExceptSelf(int[] nums) {
        int[] re = new int[nums.length];
        int k=1;
        for(int i=0;i<nums.length;i++){
            re[i]=k;
            k*=nums[i];
        }
        k=1;
        for(int i=nums.length-1;i>=0;i--){
            re[i]*=k;
            k*=nums[i];
        }
        return re;
    }

    public int[] productExceptSelf1(int[] nums) {
        int[] re = new int[nums.length];
        int k=1;
        for(int i=0;i<nums.length;i++){
            re[i]=k;
            k*=nums[i];
        }
        k=1;
        for(int i=nums.length-1;i>=0;i--){
            re[i]*=k;
            k*=nums[i];
        }
        return re;
    }
}
