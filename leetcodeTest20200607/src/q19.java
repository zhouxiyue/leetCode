import java.util.List;

public class q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        ListNode prenode = new ListNode(0);
        prenode.next=head;
        ListNode fast = prenode;
        ListNode slow = prenode;
        for(int i=0;i<n;i++){
            if(fast.next!=null){
                fast=fast.next;
            }
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        if(slow.next==prenode)
            return prenode.next;

        if(slow.next!=null){
            slow.next=slow.next.next;
        }

        return prenode.next;
    }
}
