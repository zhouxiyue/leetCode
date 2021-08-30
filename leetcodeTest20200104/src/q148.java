public class q148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=sortList(slow.next);
        slow.next=null;
        ListNode head1=sortList(head);
        return merge(head1,head2);
    }

    public ListNode merge(ListNode h1,ListNode h2){
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        if(h1.val<=h2.val){
            h1.next=merge(h1.next,h2);
            return h1;
        }else{
            h2.next=merge(h1,h2.next);
            return h2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        q148 q148 = new q148();
        q148.sortList(node1);
    }
}
