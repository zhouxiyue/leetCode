import java.util.ArrayList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class q6 {
    public int[] reversePrint(ListNode head) {
        if(head==null)
            return new int[0];
        if(head.next==null){
            int[] re = new int[1];
            re[0]=head.val;
            return re;
        }
        ListNode prehead = new ListNode(0);
        prehead.next=head;
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while(cur2!=null){
            cur1.next=cur2.next;
            cur2.next=prehead.next;
            prehead.next=cur2;
            cur2=cur1.next;
        }
        ListNode h = prehead.next;
        List<Integer> list = new ArrayList<>();
        while(h!=null){
            list.add(h.val);
            h=h.next;
        }
        int[] re = new int[list.size()];
        for(int i=0;i<re.length;i++){
            re[i]=list.get(i);
        }
        return re;
    }
}
