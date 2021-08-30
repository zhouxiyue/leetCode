import java.util.HashMap;
import java.util.Map;

public class q146 {
}

class LRUCache {

    class DeLinkNode{
        int key;
        int value;
        DeLinkNode pre;
        DeLinkNode next;
    }

    DeLinkNode head;
    DeLinkNode tail;

    public void addDelinkNode(DeLinkNode node){
        node.next=head.next;
        node.pre=head;
        head.next.pre=node;
        head.next=node;
    }

    public void removeDelinkNode(DeLinkNode node){
        node.next.pre=node.pre;
        node.pre.next=node.next;
    }

    public void moveNodetoHead(DeLinkNode node){
        removeDelinkNode(node);
        addDelinkNode(node);
    }

    public DeLinkNode popTail(){
        DeLinkNode res = tail.pre;
        removeDelinkNode(res);
        return res;
    }

    Map<Integer,DeLinkNode> cache = new HashMap<>();
    int size;
    int capacity;

    public LRUCache(int capacity){
        this.size=0;
        this.capacity=capacity;
        head = new DeLinkNode();
//        head.pre=null;
        tail = new DeLinkNode();
//        tail.next=null;
        head.next=tail;
        tail.pre=head;
    }
    public int get(int key) {
        DeLinkNode cur = cache.get(key);
        if(cur==null)
            return -1;
        moveNodetoHead(cur);
        return cur.value;
    }

    public void put(int key, int value) {
        DeLinkNode cur = cache.get(key);
        if(cur==null){
            DeLinkNode node = new DeLinkNode();
            node.key=key;
            node.value=value;
            cache.put(key,node);
            addDelinkNode(node);
            size++;
            if(size>capacity){
                DeLinkNode tail=popTail();
                cache.remove(tail.key);
                size--;
            }
        }else{
            cur.value=value;
            moveNodetoHead(cur);
        }
    }
}
