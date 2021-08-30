import java.util.Arrays;

public class q61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                num++;
        }
        int index=num;
        while(index<nums.length-1){
            if(nums[index]+1==nums[index+1])
                index++;
            else if(nums[index]==nums[index+1])
                return false;
            else{
                num-=nums[index+1]-nums[index]-1;
                if(num<0)
                    return false;
                index++;
            }
        }
        return true;
    }
}
