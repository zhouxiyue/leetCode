import java.util.Stack;

public class q155 {
}
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack ;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minstack= new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            minstack.push(x);
        }else{
            stack.push(x);
            if(x<=minstack.peek()){
                minstack.push(x);
            }else{
                minstack.push(minstack.peek());
            }
        }
    }

    public void pop() {
        if(stack.isEmpty())
            return;
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
