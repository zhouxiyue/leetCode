import java.util.*;

public class q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0)
            return new LinkedList<>();
        quicksort(nums,0,nums.length-1);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]<0)
                    left++;
                else
                    right--;
            }
        }
        List<List<Integer>> result = new LinkedList<>();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            result.add((List<Integer>) iterator.next());
        }
        return result;
    }

    public void quicksort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int l=left;
        int r=right;
        int baseval=nums[left];
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

    public static void main(String args[]){
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        q15 q15 = new q15();
        q15.threeSum(nums);
    }
}
