public class q53 {
    public int missingNumber(int[] nums) {
        int index = 0;
        while(index<nums.length){
            if(index!=nums[index])
                return index;
            index++;
        }
        return index;
    }
}
