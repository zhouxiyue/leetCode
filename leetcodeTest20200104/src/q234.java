public class q234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode head1=new ListNode(0);
        if(fast==null){
            head1.next=slow;
        }else{
            head1.next=slow.next;
        }
        ListNode cur1=head1.next;
        ListNode cur2=cur1.next;
        while(cur2!=null){
            cur1.next=cur2.next;
            cur2.next=head1.next;
            head1.next=cur2;
            cur2=cur1.next;
        }
        ListNode h2=head1.next;
        ListNode h1=head;
        while(h2!=null){
            if(h1.val!=h2.val)
                return false;
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(0);
        ListNode n3=new ListNode(1);
        q234 q234 = new q234();
        n1.next=n2;
        n2.next=n3;
        q234.isPalindrome(n1);
    }
}
