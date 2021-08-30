import java.util.ArrayList;
import java.util.List;

public class q22 {
    public List<String> generateParenthesis(int n) {
        if(n==0)
            return new ArrayList<>();
        List<String> list = new ArrayList<>();
        dfs(0,0,list,"",n);
        return list;
    }

    public void dfs(int left,int right,List<String> list,String re,int n){
        if(left>n||right>n||right>left)
            return;
        if(left==n&&right==n){
            list.add(re);
            return;
        }
        dfs(left+1,right,list,re+'(',n);
        dfs(left,right+1,list,re+')',n);
    }

}
