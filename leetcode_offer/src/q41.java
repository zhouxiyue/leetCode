import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class q41 {
}

class MedianFinder {

    private Queue<Integer> maxheap;
    private Queue<Integer> minheap;
    /** initialize your data structure here. */
    public MedianFinder() {
        maxheap = new PriorityQueue<>();
        minheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }

    public void addNum(int num) {
        if((maxheap.size()+minheap.size())%2==1){
            maxheap.add(num);
            minheap.add(maxheap.poll());
        }else{
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
    }

    public double findMedian() {
        if((maxheap.size()+ minheap.size())%2==1){
            return (double)maxheap.peek();
        }else{
            return (double) (minheap.peek()+maxheap.peek())/2;
        }
    }

    public static void main(String[] args) {
        MedianFinder MedianFinder = new MedianFinder();
        MedianFinder.addNum(1);
        MedianFinder.addNum(2);
        System.out.println(MedianFinder.findMedian());
        MedianFinder.addNum(3);
        System.out.println(MedianFinder.findMedian());
    }
}