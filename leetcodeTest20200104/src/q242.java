public class q242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] list = new int[26];
        for(int i=0;i<s.length();i++){
            list[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            list[t.charAt(i)-'a']-=1;
        }
        for(int i=0;i<list.length;i++){
            if(list[i]!=0)
                return false;
        }
        return true;
    }
}
