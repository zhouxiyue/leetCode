public class q344 {
    public void reverseString(char[] s) {
        if(s.length==0)
            return;
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char t = s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
    }
}
