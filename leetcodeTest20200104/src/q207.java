import java.util.*;

public class q207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0)
            return true;
        int[] degree = new int[numCourses];
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            degree[prerequisites[i][1]]+=1;
            if(map.isEmpty()||!map.containsKey(prerequisites[i][0])){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0],list);
            }else{
                ArrayList<Integer> list = map.get(prerequisites[i][0]);
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0],list);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<degree.length;i++){
            if(degree[i]==0)
                queue.add(i);
        }
        if(queue.isEmpty())
            return false;
        List<Integer> re = new ArrayList<>();
        while(!queue.isEmpty()){
            if(map.containsKey(queue.peek())){
                for(Integer i:map.get(queue.peek())){
                    degree[i]--;
                    if(degree[i]==0)
                        queue.add(i);
                }
            }
            re.add(queue.poll());
        }
        if(re.size()<numCourses)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int num=2;
        q207 q207 = new q207();
        q207.canFinish(num,new int[][]{{1,0}});
    }
}
