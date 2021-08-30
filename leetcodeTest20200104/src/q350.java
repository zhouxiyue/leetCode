import java.util.*;

public class q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0)
            return new int[0];
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] re = new int[list.size()];
        for(int i=0;i<re.length;i++){
            re[i]=list.get(i);
        }
        return re;
    }

    public int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> list = new ArrayList<>();
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j])
                j++;
            else if(nums1[i]<nums2[j])
                i++;
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] re = new int[list.size()];
        for(int n=0;n<list.size();n++){
            re[n]=list.get(n);
        }
        return re;
    }
}
