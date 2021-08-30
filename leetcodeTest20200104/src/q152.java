public class q152 {
    public int maxProduct(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int[] maxdp = new int[nums.length+1];
        int[] mindp = new int[nums.length+1];
        maxdp[0]=1;
        mindp[0]=1;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<0){
                int tmp = maxdp[i-1];
                maxdp[i-1]=mindp[i-1];
                mindp[i-1]=tmp;
            }
            maxdp[i]=Math.max(nums[i-1],nums[i-1]*maxdp[i-1]);
            mindp[i]=Math.min(nums[i-1],nums[i-1]*mindp[i-1]);
            max=Math.max(max,maxdp[i]);
        }
        return max;
    }

    public int maxProduct1(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int max = Integer.MIN_VALUE;
        int imax=1;
        int imin=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int tmp = imax;
                imax=imin;
                imin=tmp;
            }
            imax=Math.max(nums[i],imax*nums[i]);
            imin=Math.min(nums[i],imin*nums[i]);
            max=Math.max(max,imax);
        }
        return max;
    }

    public int maxProduct2(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int imax=1;
        int imin=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int tmp = imax;
                imax=imin;
                imin=tmp;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            imin=Math.min(imin*nums[i],nums[i]);
            max=Math.max(max,imax);
        }
        return max;
    }

    public static void main(String[] args) {
        q152 q152= new q152();
        q152.maxProduct(new int[]{-2});
    }

}
