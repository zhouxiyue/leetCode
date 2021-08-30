import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class q179 {
    List<String> list = new ArrayList<>();
    public String largestNumber(int[] nums) {
        dfs(nums,0);
        String re = list.get(0);
        for(int i=1;i<list.size();i++){
            if(re.compareTo(list.get(i))<0)
                re=list.get(i);
        }
        if(re.startsWith("0"))
            return "0";
        return re;
    }

    public void dfs(int[] nums,int index){
        if(index==nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            String str = "";
            for(int j=0;j<nums.length;j++){
                str=str+nums[j];
            }
            list.add(str);
            dfs(nums,index+1);
            swap(nums,i,index);
        }
    }

    public void swap(int[] nums,int left,int right){
        int tmp = nums[left];
        nums[left]=nums[right];
        nums[right]=tmp;
    }

    public static void main(String[] args) {
        q179 q179 = new q179();
        q179.largestNumber(new int[]{3,30,34,5,9});
    }
}

class q179_1{
    public String largestNumber(int[] nums) {
        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
                return s2.compareTo(s1);
            }
        };
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,comparator);
        String re = "";
        for(int i=0;i<str.length;i++){
            re=re+str[i];
        }
        if(re.startsWith("0"))
            return "0";
        return re;
    }

}