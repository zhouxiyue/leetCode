import java.util.HashSet;
import java.util.Set;

public class q128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        quicksort(nums,0,nums.length-1);
        int max=1;
        int re=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1])
                re++;
            else if(nums[i]==nums[i+1])
                continue;
            else
                re=1;
            if(re>max)
                max=re;
        }
        return max;
    }

    public void quicksort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int baseval = nums[left];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r&&nums[r]>=baseval)
                r--;
            if(l<r){
                nums[l]=nums[r];
                l++;
            }
            while(l<r&&nums[l]<baseval)
                l++;
            if(l<r){
                nums[r]=nums[l];
                r--;
            }
        }
        nums[l]=baseval;
        quicksort(nums,left,l-1);
        quicksort(nums,l+1,right);
    }

    public int longestConsecutive1(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int num=nums[i];
                int re=1;
                while(set.contains(num+1)){
                    re++;
                    num++;
                }
                if(re>max)
                    max=re;
            }
        }
        return max;
    }

    public int longestConsecutive2(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int curnum=num;
                int curmax = 1;
                while(set.contains(curnum+1)){
                    curnum++;
                    curmax++;
                }
                max=Math.max(max,curmax);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        q128 q128= new q128();
        q128.longestConsecutive1(new int[]{-1,1,0});
    }
}
