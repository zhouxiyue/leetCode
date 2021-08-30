public class q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        int i=0;
        for(;i<nums1.length;i++){
            nums[i]=nums1[i];
        }
        for(int j=i;j<nums2.length+i;j++){
            nums[j]=nums2[j-i];
        }
        quicksort(nums,0,nums.length-1);
        if(nums.length%2==1)
            return (double)nums[nums.length/2];
        return (double)(nums[nums.length/2-1]+nums[nums.length/2])/2;
    }

    public void quicksort(int[] nums,int left,int right){
        if(left>right)
            return;
        int l=left;
        int r=right;
        int baseval = nums[left];
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

    public static void main(String[] args){
        int[] num1 = new int[]{1,2,3};
        int[] num2 = new int[]{1,2};
        q4 q4 = new q4();
        System.out.println(q4.findMedianSortedArrays(num1,num2));
    }
}
