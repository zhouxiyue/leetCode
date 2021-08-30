import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class q139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s,0,wordDict);
    }

    public boolean dfs(String s,int index,List<String> wordDict){
        if(index==s.length()){
            return true;
        }
        for(int i=index;i<s.length();i++){
            String tmp = s.substring(index,i+1);
            if(wordDict.contains(tmp)){
                if(dfs(s,i+1,wordDict))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        q139 q139 = new q139();
        List<String> list = Arrays.asList(new String[]{"aaaa","aaa"});
        System.out.println(q139.wordBreak("aaaaaaa", list));
    }
}

class q139_1 {
    Boolean[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()];
        return dfs(s,wordDict,0);
    }

    public boolean dfs(String s,List<String> wordDict,int index){
        if(index==s.length())
            return true;
        if(memo[index]!=null){
            return memo[index];
        }
        for(int i=index;i<s.length();i++){
            String tmp = s.substring(index,i+1);
            if(wordDict.contains(tmp)){
                if(dfs(s,wordDict,i+1)){
                    return memo[index]=true;
                }
            }
        }
        return memo[index]=false;
    }

    public static void main(String[] args) {
        q139_1 q139_1 = new q139_1();
        List<String> list = Arrays.asList(new String[]{"leet","code"});
        q139_1.wordBreak("leetcode",list);
    }
}

class q139_2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[s.length()];
        while(!queue.isEmpty()){
            int start = queue.poll();
            if(!visited[start]) {
                for (int i = start; i < s.length(); i++) {
                    if (wordDict.contains(s.substring(start, i + 1))) {
                        queue.add(i + 1);
                        if (i + 1 == s.length())
                            return true;
                    }
                }
                visited[start]=true;
            }
        }
        return false;
    }
}

class q139_3 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }
        return dp[dp.length-1];
    }
    public static void main(String[] args) {
        q139_3 q139_3 = new q139_3();
        List<String> list = Arrays.asList(new String[]{"leet","code"});
        q139_3.wordBreak("leetcode",list);
    }
}

class q139_4 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i)))
                    dp[i]=true;
            }
        }
        return dp[dp.length-1];
    }
}