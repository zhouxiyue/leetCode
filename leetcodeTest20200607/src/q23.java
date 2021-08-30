import java.util.Stack;

public class q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        Stack<ListNode> stack = new Stack<>();
        for(ListNode node:lists){
            stack.push(node);
        }
        while(stack.size()>=2){
            ListNode n1 = stack.pop();
            ListNode n2 = stack.pop();
            ListNode n = merge2list(n1,n2);
            stack.push(n);
        }
        return stack.pop();
    }


    public ListNode merge2list(ListNode l1,ListNode l2){
        if(l1==null&&l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<=l2.val){
            l1.next=merge2list(l1.next,l2);
            return l1;
        }else{
            l2.next=merge2list(l1,l2.next);
            return l2;
        }
    }
}
