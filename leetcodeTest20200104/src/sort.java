public class sort {
    public void quicksort(int[] num,int left,int right){
        if(left>right)
            return;
        int l=left;
        int r=right;
        int baseval = num[left];
        while(l<r){
            while(l<r&&num[r]>=baseval){
                r--;
            }
            if(l<r){
                num[l]=num[r];
                l++;
            }
            while(l<r&&num[l]<baseval){
                l++;
            }
            if(l<r){
                num[r]=num[l];
                r--;
            }
        }
        num[l]=baseval;
        quicksort(num,left,l-1);
        quicksort(num,l+1,right);
    }


    public static void main(String[] args) {
        sort sort = new sort();
        int[] nums = new int[]{3,5,2,4,7,6,1};
        sort.quicksort(nums,0,nums.length-1);
        System.out.println();
    }
}
