import javafx.scene.effect.SepiaTone;

import java.util.*;

public class test1 {
    public List<List<String>> test(String[] strings){
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strings.length;i++){
            char[] s = strings[i].toCharArray();
            Arrays.sort(s);
            String c=String.valueOf(s);
            if(map.isEmpty()){
                List<String> li = new ArrayList<>();
                li.add(strings[i]);
                map.put(c,li);
            }else if(map.containsKey(c)){
                List<String> li = map.get(c);
                li.add(strings[i]);
                map.put(c,li);
            }else{
                List<String> li = new ArrayList<>();
                li.add(strings[i]);
                map.put(c,li);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s:map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }

    public static void main(String[] args) {
        test1  test1 = new test1();
        test1.test(new String[]{"bcd","cdb","bdc","eat","tea","tan","ate","nat","bat","abt","bta"});
    }
}
