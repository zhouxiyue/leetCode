public class q50 {
    public char firstUniqChar(String s) {
        int[] re = new int[26];
        for(int i=0;i<s.length();i++){
            re[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(re[s.charAt(i)-'a']==1)
                return s.charAt(i);
        }
        return ' ';
    }
}
