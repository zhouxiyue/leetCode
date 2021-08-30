import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class q227 {
    public int calculate(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('+',1);map.put('-',1);map.put('*',2);map.put('/',2);
        int re=0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int index=0;
        int num=0;
        while(index<s.length()){
            if(Character.isDigit(s.charAt(index))){
                while(index<s.length()&&Character.isDigit(s.charAt(index))){
                    num=num*10+(s.charAt(index)-'0');
                    index++;
                }
                stack1.push(num);
                index--;
                num=0;
            }else if(s.charAt(index)=='+'||s.charAt(index)=='-'||
                     s.charAt(index)=='*'||s.charAt(index)=='/'){
                if(stack2.isEmpty()){
                    stack2.push(s.charAt(index));
                }
                else if(map.get(stack2.peek())>=map.get(s.charAt(index))){
                    char ch = stack2.pop();
                    int num1=stack1.pop();
                    int num2=stack1.pop();
                    switch (ch){
                        case '+':stack1.push(num1+num2);break;
                        case '-':stack1.push(num2-num1);break;
                        case '*':stack1.push(num1*num2);break;
                        case '/':stack1.push(num2/num1);break;
                    }
                    stack2.push(s.charAt(index));
                }else{
                    stack2.push(s.charAt(index));
                }
            }
            index++;
        }

        while(!stack2.isEmpty()){
            char ch = stack2.pop();
            int num1=stack1.pop();
            int num2=stack1.pop();
            switch (ch){
                case '+':stack1.push(num1+num2);break;
                case '-':stack1.push(num2-num1);break;
                case '*':stack1.push(num1*num2);break;
                case '/':stack1.push(num2/num1);break;
            }
        }
        return stack1.peek();
    }

    public static void main(String[] args) {
        q227 q227 = new q227();
        System.out.println(q227.calculate("1*2-3/4+5*6-7*8+9/10"));
    }
}
