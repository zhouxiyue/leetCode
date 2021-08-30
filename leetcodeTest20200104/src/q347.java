import java.util.*;

public class q347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.isEmpty()||!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return map.get(o1)-map.get(o2);
            }
        });

        for(Integer i:map.keySet()){
            heap.add(i);
            if(heap.size()>k)
                heap.poll();
        }

        while(!heap.isEmpty()){
            list.add(heap.poll());
        }
        return list;
    }
}
