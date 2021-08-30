public class q67 {
    public int strToInt(String str) {
        if(str.length()==0)
            return 0;
        if(str.length()==1&&(str.compareTo("0")<0||str.compareTo("9")>0))
            return 0;
        int index = 0;
        while(index<str.length()&&str.charAt(index)==' ')
            index++;
        if(index==str.length())
            return 0;
        str = str.substring(index);
        boolean flag = false;
        index=0;
        if(str.charAt(index)=='-'||str.charAt(index)=='+'){
            if(str.charAt(index)=='-')
                flag=true;
            index++;
            if(str.charAt(index)<'0'||str.charAt(index)>'9')
                return 0;
            while(index<str.length()&&str.charAt(index)>='0'&&str.charAt(index)<='9'){
                index++;
            }
            str = str.substring(1,index);
            long re = 0;
            for(int i=0;i<str.length();i++){
                re+=str.charAt(i)-'0';
                if(re>Integer.MAX_VALUE) {
                    if (flag)
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                re*=10;
            }
            if(flag)
                return -Integer.valueOf(str);
            return Integer.valueOf(str);
        }
        if(str.charAt(index)<'0'||str.charAt(index)>'9')
            return 0;
        while(index<str.length()&&str.charAt(index)>='0'&&str.charAt(index)<='9'){
            index++;
        }
        str = str.substring(0,index);
        long re = 0;
        for(int i=0;i<str.length();i++){
            re+=str.charAt(i)-'0';
            if(re>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            re*=10;
        }
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        q67 q67 = new q67();
        q67.strToInt("9223372036854775808");
    }
}
