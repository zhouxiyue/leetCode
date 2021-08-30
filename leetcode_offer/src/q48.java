import java.util.HashSet;
import java.util.Set;

public class q48 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int size = 0;
        int end = 0;
        int start = 0;
        Set<Integer> list = new HashSet<>();
        while(end<s.length()){
            while(list.contains(s.charAt(end)-'a')){
                list.remove(s.charAt(start)-'a');
                start++;
                size--;
            }
            list.add(s.charAt(end)-'a');
            size+=1;
            end++;
            max = Math.max(max,size);
        }
        return max;
    }

    public static void main(String[] args) {
        q48 q48 = new q48();
        q48.lengthOfLongestSubstring("abcabcbb");
    }
}
