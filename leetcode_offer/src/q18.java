public class q18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode prehead = new ListNode(0);
        prehead.next=head;
        ListNode h = head;
        if(h.val==val){
            prehead.next=head.next;
            return prehead.next;
        }
        while(h.next.val!=val){
            h=h.next;
        }
        h.next=h.next.next;
        return prehead.next;
    }
}
