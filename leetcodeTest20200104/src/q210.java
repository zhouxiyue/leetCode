import java.util.*;

public class q210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        int[] result=new int[numCourses];
        if(prerequisites.length==0||prerequisites[0].length==0){
            for(int i=0;i<numCourses;i++){
                result[i]=i;
            }
            return result;
        }
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        List<Integer> re = new ArrayList<>();
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
        int index=0;
        if(queue.isEmpty())
            return new int[0];
        while(!queue.isEmpty()){
            if(map.containsKey(queue.peek())) {
                for (Integer i : map.get(queue.peek())) {
                    degree[i]--;
                    if(degree[i]==0)
                        queue.add(i);
                }
            }
            re.add(queue.poll());
        }
        if(re.size()<numCourses)
            return new int[0];
        for(int i=re.size()-1;i>=0;i--) {
            result[index]=re.get(i);
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=3;
        int[][] prerequisites = new int[][]{{2,0},{2,1}};
        q210 q210 = new q210();
        q210.findOrder(num,prerequisites);
    }
}
