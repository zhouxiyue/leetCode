import java.util.ArrayList;
import java.util.List;

public class q78 {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        if(nums.length==0)
            return result;
        dfs1(nums,0,new ArrayList<>());
        result.add(new ArrayList<>());
        return result;
    }

    public void dfs(int[] nums,int index,List<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            dfs(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }

    public void dfs1(int[] nums,int index,List<Integer> list){
        if(index==nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            dfs1(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
