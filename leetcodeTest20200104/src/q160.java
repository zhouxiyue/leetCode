public class q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode ha = headA;
        ListNode hb = headB;
        while(ha!=hb){
            if(ha==null){
                ha=headB;
            }else{
                ha=ha.next;
            }
            if(hb==null){
                hb=headA;
            }else {
                hb = hb.next;
            }
        }
        return ha;
    }
}
