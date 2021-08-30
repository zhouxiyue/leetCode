import java.util.*;

public class q38 {
    Set<String> re;
    public String[] permutation(String s) {
        re = new HashSet<>();
        dfs(s.toCharArray(),0);
        String[] result = new String[re.size()];
        Iterator iterator = re.iterator();
        int index=0;
        while(iterator.hasNext()){
            result[index]=(String)iterator.next();
            index++;
        }
        return result;
    }

    public void dfs(char[] c,int index){
        if(index>c.length-1) {
            return;
        }
        re.add(String.valueOf(c));
        for(int i=index;i<c.length;i++){
            swap(c,index,i);
            dfs(c,index+1);
            swap(c,index,i);
        }
    }

    public void swap(char[] c,int a,int b){
        char tmp = c[a];
        c[a]=c[b];
        c[b]=tmp;
    }

    public static void main(String[] args) {
        q38 q38 = new q38();
        q38.permutation("abc");
    }
}
