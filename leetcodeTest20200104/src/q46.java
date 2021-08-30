import java.util.*;

public class q46 {
    private Set<List<Integer>> result1;
    public List<List<Integer>> permute(int[] nums) {
        result1=new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0)
            return result;
        dfs(nums,0);
        Iterator iterator = result1.iterator();
        while(iterator.hasNext()){
            result.add((List<Integer>)iterator.next());
        }
        return result;
    }

    private void dfs(int[] nums,int index){
        if(index>=nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            List<Integer> re = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                re.add(nums[j]);
            }
            result1.add(re);
            dfs(nums,index+1);
            swap(nums,index,i);
        }
    }

    private void swap(int[] nums,int a,int b){
        int tmp = nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }
}
