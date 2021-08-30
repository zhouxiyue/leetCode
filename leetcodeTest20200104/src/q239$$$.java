import java.util.*;

public class q239$$$ {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)
            return new int[0];
        if(k>=nums.length){
            int max = nums[0];
            for(int i=1;i<nums.length;i++){
                if(max<nums[i])
                    max=nums[i];
            }
            return new int[]{max};
        }
        if(k==1){
            int[] re = new int[nums.length];
            for(int i=0;i<nums.length;i++){
                re[i]=nums[i];
            }
            return re;
        }
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(deque.isEmpty()){
                deque.add(i);
            }
            if(i-deque.getFirst()==k){
                deque.pollFirst();
            }
            if(nums[deque.getLast()]<=nums[i]){
                while(!deque.isEmpty()&&nums[deque.getLast()]<=nums[i]){
                    deque.pollLast();
                    if(deque.isEmpty())
                        break;
                }
                deque.add(i);
            }else if(nums[deque.getLast()]>=nums[i]){
                deque.add(i);
            }
            if(i>=k-1){
                list.add(deque.getFirst());
            }
        }

        int[] re = new int[list.size()];
        for(int i=0;i<list.size();i++){
            re[i]=nums[list.get(i)];
        }
        return re;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        q239$$$ q239 = new q239$$$();
        q239.maxSlidingWindow(nums,k);
    }
}
