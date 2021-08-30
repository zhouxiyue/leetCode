public class q328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode evenhead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while(odd!=null&&even!=null&&odd.next!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
}
