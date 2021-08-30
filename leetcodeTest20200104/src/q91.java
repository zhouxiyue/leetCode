import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class q91 {
    public int numDecodings(String s) {
        if(s.length()==0)
            return 0;
        return dfs(s,0);
    }

    public int dfs(String s,int index){
        if(index==s.length()){
            return 1;
        }
        if(s.charAt(index)=='0')
            return 0;
        int ans1 = dfs(s,index+1);
        int ans2=0;
        if(index<s.length()-1) {
            int num = (s.charAt(index) - '0') * 10 + (s.charAt(index + 1)-'0');
            if (num <= 26) {
                ans2 = dfs(s, index + 2);
            }
        }
        return ans1+ans2;
    }

    public int dfs1(String s,int index){
        if(index==s.length())
            return 1;
        if(s.charAt(index)=='0')
            return 0;
        int re1 = dfs1(s,index+1);
        int re2=0;
        if(index<s.length()-1){
            int num=(s.charAt(index)-'0')*10+(s.charAt(index+1)-'0');
            if(num>0&&num<=26)
                re2=dfs1(s,index+2);
        }
        return re1+re2;
    }

    public static void main(String[] args) {
        q91 q91 = new q91();
        q91.numDecodings("12");
    }
}

class q91_1{
    public int numDecodings(String s) {
        if(s.length()==0)
            return 0;
        int[] dp = new int[s.length()+1];
        dp[s.length()]=1;
        if(s.charAt(s.length()-1)=='0'){
            dp[s.length()-1]=0;
        }else{
            dp[s.length()-1]=1;
        }
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                dp[i]=0;
                continue;
            }
            if((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
                dp[i]=dp[i+1]+dp[i+2];
            }else{
                dp[i]=dp[i+1];
            }
        }
        return dp[0];
    }
}

class q91_2{
    public int numDecodings(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1){
            if(s.charAt(s.length()-1)=='0')
                return 0;
            else
                return 1;
        }
        int num2=1;
        int num1;
        int re=0;
        if(s.charAt(s.length()-1)=='0'){
            num1=0;
        }else{
            num1=1;
        }
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                num2=num1;
                num1=0;
                re=num1;
                continue;
            }
            if((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
                re=num1+num2;
                num2=num1;
                num1=re;
            }else{
                num2=num1;
                re=num1;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        q91_2 q91_2 = new q91_2();
        System.out.println(q91_2.numDecodings("27"));
    }
}
