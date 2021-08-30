import java.util.Stack;

public class q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        Stack<ListNode> stack = new Stack();
        for(ListNode li :lists){
            stack.push(li);
        }

        while(stack.size()>=2){
            ListNode l1 = stack.pop();
            ListNode l2 = stack.pop();
            ListNode l3 = merge2Lists(l1,l2);
            stack.push(l3);
        }

        return stack.pop();
    }

    public ListNode merge2Lists(ListNode l1,ListNode l2){
        if(l1==null&&l2==null)return null;
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<=l2.val){
            l1.next=merge2Lists(l1.next,l2);
            return l1;
        }else{
            l2.next=merge2Lists(l1,l2.next);
            return l2;
        }
    }
}
