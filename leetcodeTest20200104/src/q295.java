import java.util.Comparator;
import java.util.PriorityQueue;

public class q295 {
}

class MedianFinder {

    PriorityQueue<Integer> maxheap;
    PriorityQueue<Integer> minheap;
    int count;
    /** initialize your data structure here. */
    public MedianFinder() {
        maxheap = new PriorityQueue<>((x,y)->y-x);
        minheap = new PriorityQueue<>();
        count=0;
    }

    public void addNum(int num) {
        count++;
        if((count&1)==0){
            maxheap.add(num);
            minheap.add(maxheap.poll());
        }else{
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
    }

    public double findMedian() {
        if((count&1)==0){
            return (double)minheap.peek();
        }else{
            return (double)(minheap.peek()+maxheap.peek())/2;
        }
    }
}
