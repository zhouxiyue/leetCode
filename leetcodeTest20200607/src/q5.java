public class q5 {
    public String longestPalindrome(String s) {
        if(s.length()==0||s==null)
            return "";
        String re = "";
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0&&right<=s.length()-1&&s.charAt(left)==s.charAt(right)){
                if(re.length()<right-left+1)
                    re=s.substring(left,right+1);
                left--;
                right++;
            }
        }
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i+1;
            while(left>=0&&right<=s.length()-1&&s.charAt(left)==s.charAt(right)){
                if(re.length()<right-left+1)
                    re=s.substring(left,right+1);
                left--;
                right++;
            }
        }
        return re;
    }
}
