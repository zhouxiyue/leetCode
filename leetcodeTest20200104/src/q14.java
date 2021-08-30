public class q14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(str)!=0){
                str=str.substring(0,str.length()-1);
            }
        }
        return str;
    }

    public String longestCommonPrefix1(String[] strs) {
        if(strs.length==0)
            return "";
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(str)){
                str=str.substring(0,str.length()-1);
            }
        }
        return str;
    }

    public String longestCommonPrefix2(String[] strs){
        if(strs.length==0)
            return "";
        String str=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<str.length()&&j<strs[i].length();j++){
                if(str.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            str = str.substring(0,j);
            if(str.equals(""))
                return str;
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        q14 q14 = new q14();
        System.out.println(q14.longestCommonPrefix(strs));
    }
}
