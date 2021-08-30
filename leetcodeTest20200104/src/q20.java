import java.util.Stack;

public class q20{
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        if(s.length()==1)
            return false;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(c==')'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='(')
                    stack.pop();
                else
                    return false;
            }else if(c==']'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='[')
                    stack.pop();
                else
                    return false;
            }else if(c=='}'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()=='{')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
