public class q58_2 {
    public String reverseLeftWords(String s, int n) {
        char[] c = s.toCharArray();
        swap(c,0,n-1);
        swap(c,n,s.length()-1);
        swap(c,0,s.length()-1);
        return String.valueOf(c);
    }

    public void swap(char[] s,int left,int right){
        while(left<right){
            char tmp = s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }
}
