import java.util.Stack;

public class q31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(index<popped.length&&!stack.isEmpty()&&popped[index]==stack.peek()){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        q31 q31 = new q31();
        System.out.println(q31.validateStackSequences(new int[]{1,2,3,4,5},
                new int[]{4,5,3,2,1}));
    }
}
