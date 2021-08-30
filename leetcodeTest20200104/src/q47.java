import java.util.*;

public class q47 {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        dfs(nums,0);
        List<List<Integer>> result = new ArrayList<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            result.add((List<Integer>)iterator.next());
        }
        return result;
    }

    public void dfs(int[] nums,int index){
        if(index>=nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                list.add(nums[j]);
            }
            set.add(list);
            dfs(nums,index+1);
            swap(nums,i,index);
        }
    }

    public void swap(int[] nums,int left,int right){
        int tmp = nums[left];
        nums[left]=nums[right];
        nums[right]=tmp;
    }
}
