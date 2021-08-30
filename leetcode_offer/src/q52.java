public class q52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int num1 = 0;
        int num2 = 0;
        ListNode h1 = headA;
        ListNode h2 = headB;
        while(h1!=null){
            num1++;
            h1=h1.next;
        }
        while(h2!=null){
            num2++;
            h2=h2.next;
        }

        if(num1>num2){
            int gap = num1-num2;
            while(gap>0){
                headA=headA.next;
                gap--;
            }
        }
        if(num1<num2){
            int gap = num2-num1;
            while(gap>0){
                headB=headB.next;
                gap--;
            }
        }
        while(headA!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
