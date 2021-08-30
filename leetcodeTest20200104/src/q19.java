class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n!=0){
            return null;
        }
        ListNode prehead = new ListNode(0);
        prehead.next=head;
        ListNode fast = prehead;
        ListNode slow = prehead;
        for(int i=0;i<n;i++){
            if(fast.next!=null){
                fast=fast.next;
            }
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }


        if(slow==prehead){
            return prehead.next.next;
        }
        slow.next=slow.next.next;
        return prehead.next;
    }
}
