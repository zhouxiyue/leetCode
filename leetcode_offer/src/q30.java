import java.util.Stack;

public class q30 {
}

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            minstack.push(x);
            return;
        }
        stack.push(x);
        if(minstack.peek()<x)
            minstack.push(minstack.peek());
        else
            minstack.push(x);
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

    public int min() {
        return minstack.peek();
    }
}

