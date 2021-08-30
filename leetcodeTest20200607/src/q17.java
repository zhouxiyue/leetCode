import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q17 {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        char[] chars = digits.toCharArray();
        List<String> re = new ArrayList<>();
        re.add("");
        for(int i=0;i<chars.length;i++){
            re = combine(map.get(chars[i]),re);
        }
        return re;
    }

    public List<String> combine(String s,List<String> list){
        List<String> re = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<s.length();j++){
                re.add(list.get(i)+s.charAt(j));
            }
        }
        return re;
    }
}
