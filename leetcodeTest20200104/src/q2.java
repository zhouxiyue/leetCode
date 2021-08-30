public class q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int rest=0;
        while(l1!=null&&l2!=null){
            int re=(l1.val+l2.val+rest)%10;
            ListNode newnode = new ListNode(re);
            rest=(l1.val+l2.val+rest)/10;
            cur.next=newnode;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null&&l2==null&&rest==0)
            return pre.next;
        if(l1==null&&l2==null&&rest!=0){
            ListNode newnode = new ListNode(rest);
            cur.next=newnode;
            return pre.next;
        }
        while(l1!=null){
            int re = (l1.val+rest)%10;
            ListNode newnode = new ListNode(re);
            cur.next=newnode;
            cur=cur.next;
            rest=(l1.val+rest)/10;
            l1=l1.next;
        }
        while(l2!=null){
            int re = (l2.val+rest)%10;
            ListNode newnode = new ListNode(re);
            cur.next=newnode;
            cur=cur.next;
            rest=(l2.val+rest)/10;
            l2=l2.next;
        }
        if(rest!=0){
            ListNode newnode = new ListNode(rest);
            cur.next=newnode;
        }
        return pre.next;
    }
}
