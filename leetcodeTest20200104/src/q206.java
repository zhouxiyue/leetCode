public class q206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
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
        return prehead.next;
    }
}
