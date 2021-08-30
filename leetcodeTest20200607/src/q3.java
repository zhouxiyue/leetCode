import java.util.HashMap;
import java.util.Map;

public class q3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;
        Map<Character,Integer> map = new HashMap<>();
        int right=0;
        int left=0;
        int re=0;
        for(;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            re=Math.max(re,right-left+1);
        }
        return re;
    }
}
