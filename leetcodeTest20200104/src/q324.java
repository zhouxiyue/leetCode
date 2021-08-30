import java.util.Arrays;

public class q324 {
    public void wiggleSort(int[] nums) {
        if(nums.length==0)
            return;
        Arrays.sort(nums);
        int[] nums1 = new int[nums.length%2==0?nums.length/2:nums.length/2+1];
        int[] nums2 = new int[nums.length/2];
        System.arraycopy(nums,0,nums1,0,nums1.length);
        System.arraycopy(nums,nums1.length,nums2,0,nums.length/2);
        int i=0;

        int j=nums1.length-1;
        int k=0;
        for(;i<nums.length/2;i++){
            nums[i*2]=nums1[j];
            j--;
            nums[i*2+1]=nums2[k];
            k++;
        }
        if(nums.length%2!=0)
            nums[nums.length/2]=nums1[nums1.length-1-i];
    }



    public void findmid(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int baseval = nums[left];
        while(left<right){
            while(left<right&&nums[right]>=baseval){
                right--;
            }
            if(left<right){
                nums[left]=nums[right];
                left++;
            }
            while(left<right&&nums[left]<baseval){
                left++;
            }
            if(left<right){
                nums[right]=nums[left];
                right--;
            }
        }
        nums[left]=baseval;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,2,3,1};
        q324 q324 = new q324();
        q324.wiggleSort(nums);
    }
}
