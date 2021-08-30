import java.util.HashMap;
import java.util.Map;

public class q76$$$ {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";
        if(s.equals(t))
            return s;
        int left = 0;
        int right = 0;
        int match=0;
        int start=0;
        int end=0;
        int minlen=Integer.MAX_VALUE;
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for(Character c:t.toCharArray()){
            if(need.isEmpty()||!need.containsKey(c)) {
                need.put(c, 1);
            }else if(need.containsKey(c)){
                need.put(c,need.get(c)+1);
            }
        }
        while(right<s.length()){
            char c = s.charAt(right);
            if(need.containsKey(c)){
                if(window.isEmpty()||!window.containsKey(c)) {
                    window.put(c, 1);
                }
                else if(window.containsKey(c))
                    window.put(c,window.get(c)+1);
                if(need.get(c).equals(window.get(c))){
                    match++;
                }
            }
            right++;
            while(match==need.size()){
                if(right-left<minlen){
                    start=left;
                    end=right;
                    minlen=right-left+1;
                }
                char c2 = s.charAt(left);
                if(need.containsKey(c2)){
                    window.put(c2,window.get(c2)-1);
                    if(window.get(c2)<need.get(c2)){
                        match--;
                    }
                }
                left++;
            }
        }
        return s.substring(start,end);
    }

    public static void main(String[] args) {
//        String s ="ADOBECODEBANC";
//        String t ="ABC";
        String s="bbaa";
        String t="aba";
        q76$$$ q76$$$ = new q76$$$();
        System.out.println(q76$$$.minWindow(s, t));
    }
}
