import java.util.*;

public class test {
    Set<List<Integer>> list = new HashSet<>();
    public int[][] test(int[] nums,int target){
        dfs(nums,0,target,new ArrayList<>());
        int[][] result = new int[list.size()][];
        Iterator iterator = list.iterator();
        int i=0;
        while(iterator.hasNext()){
            List<Integer> li = (List)iterator.next();
            result[i]=new int[li.size()];
            for(int j=0;j<li.size();j++){
                result[i][j]=li.get(j);
            }
            i++;
        }
        return result;
    }

    public void dfs(int[] nums,int index,int target,List<Integer> li){
        if(target==0){
            Collections.sort(li);
            list.add(new ArrayList(li));
            return;
        }
        if(target<0)
            return;
//        if(index>=nums.length-1)
//            return;
        for(int i=index;i<nums.length;i++){
//            target-=nums[i];
            li.add(nums[i]);
            dfs(nums,i,target-nums[i],li);
//            target+=nums[i];
            li.remove(li.size()-1);
        }
    }

    public static void main(String[] args) {
        test test = new test();
        test.test(new int[]{2,3,5},8);
    }

}
