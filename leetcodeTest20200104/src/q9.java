import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q9 {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        List<Character> list=new ArrayList<Character>();
        List<Character> list2=new ArrayList<Character>();
        String s=String.valueOf(x);
        char c[]=s.toCharArray();
        for(char t:c){
            list.add(t);
            list2.add(t);
        }
        Collections.reverse(list2);
        if(list.equals(list2)){
            return true;
        }
        else{
            return false;
        }

    }
}
