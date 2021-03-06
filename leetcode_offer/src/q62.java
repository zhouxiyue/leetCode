import java.util.ArrayList;
import java.util.List;

public class q62 {
    public int lastRemaining(int n, int m) {
        if(n==0||m==0)
            return -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int c = (m-1)%n;
        while(list.size()!=1){
            list.remove(c);
            c=(c+m-1)%list.size();
        }
        return list.get(0);
    }
}
