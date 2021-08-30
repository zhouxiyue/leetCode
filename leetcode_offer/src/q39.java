public class q39 {
    public int majorityElement(int[] nums) {
        int num=1;
        int re = nums[0];
        for(int i=1;i<nums.length;i++){
            if(re!=nums[i]){
                num--;
                if(num==0) {
                    re = nums[i];
                    num=1;
                }
            }else{
                num++;
            }
        }
        return re;
    }
}
