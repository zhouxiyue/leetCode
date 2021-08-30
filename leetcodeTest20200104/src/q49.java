import java.util.*;

public class q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs.length==0)
            return list;
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
                Arrays.sort(c);
            if(map.size()==0) {
                List<String> st = new ArrayList<>();
                st.add(strs[i]);
                map.put(Arrays.toString(c),st);
            }
            else{
                if(map.containsKey(Arrays.toString(c))){
                    List<String> s = map.get(Arrays.toString(c));
                    s.add(strs[i]);
                    map.put(Arrays.toString(c),s);
                }else{
                    List<String> st = new ArrayList<>();
                    st.add(strs[i]);
                    map.put(Arrays.toString(c),st);
                }
            }
        }
        for(String s:map.keySet()){
            list.add(map.get(s));
        }
        return list;
    }

    public static void main(String[] args) {
        q49 q49 = new q49();
        q49.groupAnagrams(new String[]{"",""});
    }
}
