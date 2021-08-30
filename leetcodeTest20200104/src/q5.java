public class q5 {
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
        String re="";
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                if(right-left+1>re.length()){
                    re=s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }

        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i+1;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                if(right-left+1>re.length()){
                    re=s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        return re;
    }
}
