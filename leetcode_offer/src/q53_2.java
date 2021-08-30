public class q53_2 {
    public int search(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target)
            return target;
        int left = 0;
        int right = nums.length-1;
        int re = 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                int l=mid-1;
                int r=mid+1;
                while(l>=0&&nums[l]==target){
                    re++;
                    l--;
                }
                while(r<=nums.length-1&&nums[r]==target){
                    re++;
                    r++;
                }
                return re;
            }else if(nums[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return 0;
    }

    public static void main(String[] args) {
        q53_2 q53_2 = new q53_2();
        q53_2.search(new int[]{1,4},4);
    }
}
