import java.util.Stack;

public class q125 {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)
            return true;
        s=s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if((c>='0'&&c<='9')||(c>='a'&&c<='z'))
                stack.push(c);
        }
        for(int i=0;i<s.length();i++){

            if(((s.charAt(i)>='0'&&s.charAt(i)<='9')||
                    (s.charAt(i)>='a'&&s.charAt(i)<='z'))) {
                char c1 = s.charAt(i);
                char c2 = stack.pop();
                if(c1!=c2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        q125 q125 = new q125();
        System.out.println(q125.isPalindrome("1b1"));
    }
}
