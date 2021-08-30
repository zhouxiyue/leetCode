import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q149 {
    public int maxPoints(int[][] points) {
        if(points.length==0||points[0].length==0)
            return 0;
        int m=points.length;
        String rate;
        Map<String, List<Pair>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                int y=y2-y1;
                int x=x2-x1;
                int n = gcd(x, y);
                rate=x/n+""+y/n;
                if(map.isEmpty()||!map.containsKey(rate)){
                    Pair pair1 = new Pair<>(x1,y1);
                    Pair pair2 = new Pair<>(x2,y2);
                    Pair pair = new Pair<>(pair1,pair2);
                    List<Pair> list = new ArrayList<>();
                    list.add(pair);
                    map.put(rate,list);
                }else{
                    List<Pair> list = map.get(rate);
                    Pair pair1 = new Pair<>(x1,y1);
                    Pair pair2 = new Pair<>(x2,y2);
                    Pair pair = new Pair<>(pair1,pair2);
                    list.add(pair);
                    map.put(rate,list);
                }
            }
        }
        int max=0;
        for(String d:map.keySet()){
            if(max<map.get(d).size())
                max=map.get(d).size();
        }
        return max;
    }

    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        int[][] points = new int[][]
                {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        q149 q149 = new q149();
        q149.maxPoints(points);
    }
}

class q149_1 {
    public int maxPoints(int[][] points) {
        if(points==null)
            return 0;
        else if(points.length<=2)
            return points.length;
        Map<String,Integer> map = new HashMap<>();
        int ans = 1;
        for(int i=0;i<points.length;i++){
            int max = 0;
            int dup = 1;
            int x1 = points[i][0];
            int y1 = points[i][1];
            map.clear();
            for(int j=i+1;j<points.length;j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                int d1 = x2-x1;
                int d2 = y2-y1;
                if(d1==0&&d2==0){
                    dup++;
                    continue;
                }
                int n = gcd(d1,d2);

                String key = (d1/n)+""+(d2/n);
                map.put(key,map.getOrDefault(key,0)+1);
                max = Math.max(max,map.get(key));
            }
            ans = Math.max(ans,max+dup);
        }

        return ans;
    }

    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        int[][] points = new int[][]
                {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        q149_1 q149_1 = new q149_1();
        q149_1.maxPoints(points);
    }
}