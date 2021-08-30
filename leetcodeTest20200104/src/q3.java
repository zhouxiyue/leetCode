import java.util.HashMap;
import java.util.Map;

public class q3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==""||s.length()==0)return 0;
        int left=0;
        int right=0;
        int res=0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
//                left = map.get(s.charAt(right))+1;
            }
            map.put(s.charAt(right),right);
            res=Math.max(res,right-left+1);
        }
        return res;
    }

    public int lengthOfLongestSubstring1(String s) {
        if(s==null||s.length()==0)
            return 0;
        int left=0;
        int right=0;
        int res=0;
        Map<Character,Integer> map = new HashMap<>();
        for(;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            res=Math.max(res,right-left+1);
        }
        return res;
    }
    public static void main(String[] args) {
        q3 q3=new q3();
        q3.lengthOfLongestSubstring("abba");
    }
}
