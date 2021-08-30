import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q131 {
    List<List<String>> list = new ArrayList<>();
    String S;
    public List<List<String>> partition(String s) {
        if(s.length()==0)
            return list;
        if(s.length()==1){
            List<String> re = new ArrayList<>();
            re.add(s);
            list.add(re);
            return list;
        }
        S=s;
        part(0,new ArrayList<>());
        return list;
    }

    public void part(int index,List<String> re){
        if(index==S.length()){
            list.add(new ArrayList<>(re));
            return;
        }
        for(int i=index;i<S.length();i++){
            if(help(S.substring(index,i+1))) {
                re.add(S.substring(index,i+1));
                part(i+1, re);
                re.remove(re.size() - 1);
            }
        }
    }

    public void part1(int index,List<String> re){
        if(index==S.length()){
            list.add(new ArrayList<>(re));
            return;
        }
        for(int i=index;i<S.length();i++){
            if(help(S.substring(index,i+1))){
                re.add(S.substring(index,i+1));
                part1(i+1,re);
                re.remove(re.size()-1);
            }
        }
    }

    public boolean help(String s){
        if(s.length()<=1)
            return true;
        s=s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if((c>='0'&&c<='9')||(c>='a'&&c<='z'))
                stack.push(c);
        }
        for(int i=0;i<s.length();i++){

            if(((s.charAt(i)>='0'&&s.charAt(i)<='9')||
                    (s.charAt(i)>='a'&&s.charAt(i)<='z'))) {
                char c1 = s.charAt(i);
                char c2 = stack.pop();
                if(c1!=c2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        q131 q131 = new q131();
        q131.partition("aab");
    }
}
