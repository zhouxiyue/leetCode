import java.util.HashMap;
import java.util.Map;
class Node1 {
    int val;
    Node1 next;
    Node1 random;

    public Node1(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class q138 {
    public Node1 copyRandomList(Node1 head) {
        if(head==null)
            return null;
        Node1 prehead = new Node1(0);
        Node1 cur = prehead;
        Node1 h=head;
        Map<Node1,Node1> map = new HashMap<>();
        while(h!=null){
            Node1 tmp = new Node1(h.val);
            map.put(h,tmp);
            cur.next=tmp;
            cur=cur.next;
            h=h.next;
        }
        for(Node1 n:map.keySet()){
            Node1 t = map.get(n);
            Node1 r = n.random;
            t.random=map.get(r);
        }
        return prehead.next;
    }
}
