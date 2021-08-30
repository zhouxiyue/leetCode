import java.util.Stack;

public class q58 {
    public String reverseWords(String s) {
        if(s.length()==0)
            return "";
        String[] re = s.split(" ");
        if(re.length==0)
            return "";
        Stack<String> stack = new Stack<>();
        for(int i=0;i<re.length;i++){
            stack.push(re[i]);
        }
        String result = "";
        while(!stack.isEmpty()){
            if(!stack.peek().equals("")) {
                result = result + stack.pop() + " ";
            }else
                stack.pop();
        }
        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args) {
        q58 q58 = new q58();
        q58.reverseWords("the sky is blue");
    }
}
