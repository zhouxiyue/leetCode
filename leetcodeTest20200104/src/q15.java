import java.util.*;

public class q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List list = new ArrayList();
        Set set = new HashSet();
        if(nums.length==0)
            return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> re = new ArrayList<>();
                    re.add(nums[i]);
                    re.add(nums[left]);
                    re.add(nums[right]);
                    set.add(re);
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        Sort(nums,0,nums.length-1);
        Set<List<Integer>> re = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    re.add(list);
                    left++;
                    right--;
                }else if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        List result = new ArrayList<>();
        Iterator iterator = re.iterator();
        while(iterator.hasNext()){
            result.add(iterator.next());
        }
        return result;
    }

    public void Sort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int basesval = nums[left];
        int l=left;
        int r=right;
        while(l<r){
            while(l<r&&nums[r]>=basesval)
                r--;
            if(l<r){
                nums[l]=nums[r];
                l++;
            }
            while(l<r&&nums[l]<basesval)
                l++;
            if(l<r){
                nums[r]=nums[l];
                r--;
            }
        }
        nums[l]=basesval;
        Sort(nums,left,l-1);
        Sort(nums,l+1,right);
    }

    public static void main(String[] args) {
        q15 q15 = new q15();
        q15.threeSum1(new int[]{-1, 0, 1, 2, -1, -4});
    }

}
