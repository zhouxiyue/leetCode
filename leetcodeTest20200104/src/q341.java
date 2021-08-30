import java.util.*;

public class q341 {

}

interface NestedInteger {
      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }


class NestedIterator implements Iterator<Integer> {
//    List<Integer> list = new ArrayList<>();
//    int index=-1;
//    public void add(List<NestedInteger> nestedList){
//        for(NestedInteger nestedInteger:nestedList){
//            if(nestedInteger.isInteger())
//                list.add(nestedInteger.getInteger());
//            else
//                add(nestedInteger.getList());
//        }
//    }
//
//    public NestedIterator(List<NestedInteger> nestedList) {
//        add(nestedList);
//    }
//
//    @Override
//    public Integer next() {
//        index++;
//        return list.get(index);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index+1<list.size();
//    }

    Queue<NestedInteger> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    int index=-1;
    public NestedIterator(List<NestedInteger> nestedList) {
        if(nestedList.size()==0)
            return;
        for(NestedInteger nestedInt:nestedList){
            queue.add(nestedInt);
            while(!queue.isEmpty()){
                NestedInteger ne = queue.poll();
                if(ne.isInteger()) {
                    list.add(ne.getInteger());
                }else{
                    Queue<NestedInteger> tmp = new LinkedList<>();
                    while(!queue.isEmpty()){
                        tmp.add(queue.poll());
                    }
                    for(NestedInteger n:ne.getList()){
                        queue.add(n);
                    }
                    for(NestedInteger n:tmp){
                        queue.add(n);
                    }
                }
            }
        }

    }

    @Override
    public Integer next() {
        index++;
        return list.get(index);
    }

    @Override
    public boolean hasNext() {
        return index+1<list.size();
    }
}

