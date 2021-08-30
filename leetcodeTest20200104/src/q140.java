import java.lang.reflect.Array;
import java.util.*;

public class q140 {
    List<String> result = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        dfs(s,0,wordDict,"");
        return result;
    }

    public boolean dfs(String s,int index,List<String> wordDict,String re){
        if(index==s.length()) {
            result.add(re);
            return true;
        }
        for(int i=index;i<s.length();i++){
            if(wordDict.contains(s.substring(index,i+1))){
                if(re.equals(""))
                    re=re+s.substring(index,i+1);
                else
                    re=re+" "+s.substring(index,i+1);
                dfs(s,i+1,wordDict,re);
                re=re.substring(0,re.length()-(i+1-index));
                if(!re.equals("")&&re.charAt(re.length()-1)==' '){
                    re=re.substring(0,re.length()-1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        q140 q140 = new q140();
        List<String> list = Arrays.asList(new String[]{"cat", "cats", "and", "sand", "dog"});
        q140.wordBreak("catsanddog",list);
    }
}

class q140_1 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>[] dp = new ArrayList[s.length()+1];
        ArrayList<String> li = new ArrayList<>();
        li.add("");
        dp[0]=li;
        for(int i=1;i<=s.length();i++){
            ArrayList<String> list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(dp[j].size()>0&&wordDict.contains(s.substring(j,i))){
                    for(String l:dp[j]){
                        list.add(l+(l.equals("")?"":" ")+s.substring(j,i));
                    }
                }
            }
            dp[i]=list;
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        q140_1 q140_1 = new q140_1();
        List<String> list = Arrays.asList(new String[]{"cat", "cats", "and", "sand", "dog"});
        q140_1.wordBreak("catsanddog",list);
    }
}

class q140_2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>[] dp = new ArrayList[s.length()+1];
        List<String> dp0 = new ArrayList<>();
        dp0.add("");
        dp[0]=dp0;
        for(int i=1;i<s.length()+1;i++){
            List<String> list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(dp[j].size()>0&&wordDict.contains(s.substring(j,i))){
                    for(String sj:dp[j]){
                        list.add(sj+(sj.equals("")?"":" ")+s.substring(j,i));
                    }
                }
            }
            dp[i]=list;
        }
        return dp[dp.length-1];
    }
}