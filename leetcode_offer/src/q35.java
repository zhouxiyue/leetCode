import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class q35 {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node h = head;
        Node preh1 = new Node(0);
        Node h1 = preh1;
        while(h!=null){
            Node node = new Node(h.val);
            h1.next=node;
            h1=h1.next;
            map.put(h,node);
            h=h.next;
        }
        for(Node n:map.keySet()){
            map.get(n).random=map.get(n.random);
        }
        return preh1.next;
    }
}
