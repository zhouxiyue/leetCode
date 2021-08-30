import java.util.*;

public class q56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][0];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> re = new ArrayList<>();
        int[] tmp = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(tmp[1]<intervals[i][0]){
                re.add(tmp);
                tmp=intervals[i];
            }else{
                tmp[1]=Math.max(tmp[1],intervals[i][1]);
            }
        }
        re.add(tmp);
        int[][] result = new int[re.size()][2];
        for(int i=0;i<re.size();i++){
            result[i][0]=re.get(i)[0];
            result[i][1]=re.get(i)[1];
        }
        return result;
    }

    public int[][] merge1(int[][] intervals) {
        if(intervals.length==0)
            return new int[0][0];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int[] tmp = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(tmp[1]<intervals[i][0]){
                list.add(tmp);
                tmp=intervals[i];
            }else{
                tmp[1]=Math.max(tmp[1],intervals[i][1]);
            }
        }
        list.add(tmp);
        int[][] result = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i][0]=list.get(i)[0];
            result[i][1]=list.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        q56 q56 = new q56();
        q56.merge(intervals);
    }
}
