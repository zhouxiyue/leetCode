public class q395 {
    public int longestSubstring(String s, int k) {
        if(s.length()==0)
            return 0;
        if(k<=1)
            return s.length();
        return count(s.toCharArray(),k,0,s.length()-1);
    }

    public int count(char[] chars,int k,int p1,int p2){
        if(p2-p1+1<k)
            return 0;
        int[] time = new int[26];
        for(int i=p1;i<=p2;i++){
            time[chars[i]-'a']++;
        }
        while(p2-p1+1>=k&&time[chars[p1]-'a']<k){
            p1++;
        }
        while(p2-p1+1>=k&&time[chars[p2]-'a']<k){
            p2--;
        }
        if(p2-p1+1<k)
            return 0;
        for(int i=p1;i<=p2;i++){
            if(time[chars[i]-'a']<k){
                return Math.max(count(chars,k,p1,i-1),
                        count(chars,k,i+1,p2));
            }
        }
        return p2-p1+1;
    }
}
