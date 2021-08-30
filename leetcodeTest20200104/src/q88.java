public class q88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if(n==0)
            return;
        int[] tmp = new int[m+n];
        int left1=0;
        int left2=0;
        int index=0;
        while(left1<m&&left2<n){
            if(nums1[left1]<=nums2[left2]){
                tmp[index]=nums1[left1];
                left1++;
                index++;
            }else{
                tmp[index]=nums2[left2];
                left2++;
                index++;
            }
        }
        if(left1<m){
            for(int i=left1;i<m;i++){
                tmp[index]=nums1[i];
                index++;
            }
        }
        if(left2<n){
            for(int i=left2;i<n;i++){
                tmp[index]=nums2[i];
                index++;
            }
        }
        for(int i=0;i<tmp.length;i++){
            nums1[i]=tmp[i];
        }
    }
}
