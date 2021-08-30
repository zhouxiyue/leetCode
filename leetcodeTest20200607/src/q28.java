public class q28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0&&needle.length()==0)return 0;
        if(needle.length()==0)return 0;
        if(haystack.length()==0)return -1;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int index=i+1;
                int indext=1;
                while(index<haystack.length()&&
                indext<needle.length()&&
                haystack.charAt(index)==needle.charAt(indext)){
                    index++;
                    indext++;
                }
                if(indext==needle.length())
                    return i;
            }
        }
        return -1;
    }
}
