import java.util.HashMap;
import java.util.Map;
/*
* 思路：将数组中的每个数字以及数字的数组下标都放入map中，然后遍历数组中的数字
* 如果这个数字在map中并且目标和减去这个数字的结果也在map中
* 则返回这两个数字的数组下标
* */
public class q1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&
                    map.containsKey(target-nums[i])&&
                    map.get(target-nums[i])!=i){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
        }
        return result;
    }
}
