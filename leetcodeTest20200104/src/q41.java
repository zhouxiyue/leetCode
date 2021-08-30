import java.util.HashSet;
import java.util.Set;

public class q41 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return 1;
        if(nums.length==1){
            if(nums[0]==1)
                return 2;
            else if(nums[0]<=0)
                return 1;
            else
                return 1;
        }
        int[] num = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=1&&nums[i]<=nums.length){
                num[nums[i]]=nums[i];
            }
        }
        for(int i=0;i<num.length;i++){
            if(num[i]!=i){
                return i;
            }
        }
        return num[num.length-1]+1;
    }

    public int firstMissingPositive1(int[] nums) {
        if(nums.length==0)
            return 1;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
                int tmp = nums[i];
                nums[i]=nums[tmp-1];
                nums[tmp-1]=tmp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length+1;
    }

    public int firstMissingPositive2(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=1;i<nums.length;i++){
            if(!list.contains(i))
                return i;
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        q41 q41 = new q41();
        System.out.println(q41.firstMissingPositive1(new int[]{3,4,-1,1}));
    }
}
