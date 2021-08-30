public class q22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head;
        for(int i=0;i<k;i++){
            if(fast==null)
                return null;
            fast=fast.next;
        }
        ListNode slow = head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
