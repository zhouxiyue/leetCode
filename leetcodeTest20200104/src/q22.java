import java.util.ArrayList;
import java.util.List;

public class q22 {
    public List<String> generateParenthesis(int n) {
        if(n==0)return new ArrayList<String>();
        List<String> list = new ArrayList<>();
        dfs(0,0,"",list,n);
        return list;
    }

    public void dfs(int leftnum,int rightnum,String re,List<String> list,int n){
        if(leftnum==n&&rightnum==n){
            list.add(re);
            return;
        }
        if(leftnum<n){
            dfs(leftnum+1,rightnum,re+"(",list,n);
        }
        if(leftnum>rightnum){
            dfs(leftnum,rightnum+1,re+")",list,n);
        }
    }

    public static void main(String[] args) {
        q22 q22 = new q22();
        q22.generateParenthesis(3);
    }

}
