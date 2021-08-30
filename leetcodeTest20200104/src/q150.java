import java.util.Stack;

public class q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&&
                    !tokens[i].equals("-")&&
                    !tokens[i].equals("*")&&
                    !tokens[i].equals("/")){
                stack.add(Integer.valueOf(tokens[i]));
            }else{
                int num1=stack.pop();
                int num2=stack.pop();
                int re=0;
                switch (tokens[i]){
                    case "+":re=num1+num2;break;
                    case "-":re=num2-num1;break;
                    case "*":re=num1*num2;break;
                    case "/":re=num2/num1;break;
                }
                stack.add(re);
            }
        }
        return stack.pop();
    }
}
