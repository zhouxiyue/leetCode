import java.util.ArrayList;
import java.util.List;

public class q163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        long l=lower;
        long r=upper;
        List<String> list = new ArrayList<>();
        if(nums.length==0){
            add(list,l-1,r+1);
            return list;
        }
        add(list,l-1,nums[0]);
        for(int i=1;i<nums.length;i++){
            add(list,nums[i-1],nums[i]);
        }
        add(list,nums[nums.length-1],r+1);
        return list;
    }

    public void add(List<String> list,long l,long r){
        if(l==r||l+1==r)
            return;
        else if(l+1==r-1){
            list.add(""+(l+1));
        }else{
            list.add((l+1)+"->"+(r-1));
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2147483647};
        int l=0;
        int r=2147483647;
        q163 q163 = new q163();
        q163.findMissingRanges(nums,l,r);
    }
}
