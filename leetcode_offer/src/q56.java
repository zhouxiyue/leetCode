import java.util.ArrayList;
import java.util.List;

public class q56 {
    public int[] singleNumbers(int[] nums) {
        int num = 0;
        for(int i=0;i<nums.length;i++){
            num^=nums[i];
        }
        int index=1;

        while((index&num)==0){
            index<<=1;
        }
        int[] re = new int[2];
        for(int i=0;i<nums.length;i++){
            if((nums[i]&index)==0){
                re[0]^=nums[i];
            }else{
                re[1]^=nums[i];
            }
        }
        return re;
    }
}
