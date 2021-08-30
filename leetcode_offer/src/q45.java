import java.util.*;

public class q45 {
    private Set<String> set;
    public String minNumber(int[] nums) {
        set = new HashSet<>();
        dfs(nums,0);
        Iterator iterator = set.iterator();
        String result = (String)iterator.next();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            if(result.compareTo(s)>0){
                result = s;
            }
        }
        return result;
    }

    public void dfs(int[] nums,int index){
        if(index>nums.length)
            return;
        String s = "";
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
        }
        set.add(s);
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            dfs(nums,index+1);
            swap(nums,index,i);
        }
    }

    public void swap(int[] nums,int a,int b){
        int tmp = nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;
    }

    public static void main(String[] args) {
        q45 q45 = new q45();
        q45.minNumber(new int[]{10,2});
    }

    public String minNumber1(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(String.valueOf(nums[i]));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        String s = "";
        for(String s1:list){
            s=s+s1;
        }
        return s;
    }
}
