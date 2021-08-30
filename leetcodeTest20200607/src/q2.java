/*
* 思路：如果l1和l2都不为空，则求出两个链表的当前位上的数字和并加上上一位的
* 进位结果，求出的结果对10求余，得出这位上的结果，求出的结果除以10，求出进位的结果
* 进到下一位。
* */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prenode = new ListNode(0);
        ListNode cur = prenode;
        int rest=0;
        while(l1!=null&&l2!=null){
            int sum = rest+l1.val+l2.val;
            rest=sum/10;
            int re = sum%10;
            ListNode newNode = new ListNode(re);
            cur.next=newNode;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null&&l2==null&&rest==0)
            return prenode.next;
        if(l1==null&&l2==null&&rest!=0){
            ListNode newnode = new ListNode(rest);
            cur.next=newnode;
            return prenode.next;
        }
        while(l1!=null){
            int re = (l1.val+rest)%10;
            ListNode newnode = new ListNode(re);
            cur.next=newnode;
            cur=cur.next;
            rest=(rest+l1.val)/10;
            l1=l1.next;
        }
        while(l2!=null){
            int re = (l2.val+rest)%10;
            ListNode newnode = new ListNode(re);
            cur.next = newnode;
            cur=cur.next;
            rest=(rest+l2.val)/10;
            l2=l2.next;
        }
        if(rest!=0){
            ListNode newnode = new ListNode(rest);
            cur.next=newnode;
        }
        return prenode.next;
    }
}
