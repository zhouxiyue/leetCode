import java.util.HashMap;
import java.util.Map;

public class q454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> mapab = new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int re = A[i]+B[j];
                mapab.put(re,mapab.getOrDefault(re,0)+1);
            }
        }
        int res=0;
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int re = -(C[i]+D[j]);
                if(mapab.containsKey(re))
                    res+=mapab.get(re);
            }
        }

        return res;

    }
}
