import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class q380 {

}

class RandomizedSet {

    Map<Integer,Integer> map;
    List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map=new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else{
            int index = map.get(val);
            if(list.size()-1==index){
                list.remove(list.size()-1);
            }else {
                int last = list.get(list.size() - 1);
                list.set(index, last);
                list.remove(list.size() - 1);
                map.put(last,index);
            }
            map.remove(val);
            return true;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rm= new Random();
        int i=rm.nextInt(list.size());
        return list.get(i);
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(0);
        randomizedSet.insert(1);
        randomizedSet.remove(0);
        randomizedSet.insert(2);
        randomizedSet.remove(1);
        System.out.println(randomizedSet.getRandom());
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2  = new ConcurrentHashMap<>();
    }
}
