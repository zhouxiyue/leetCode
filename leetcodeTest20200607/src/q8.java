public class q8 {
    public int myAtoi(String str) {
        if(str.length()==0||str==null)
            return 0;
        if(str.charAt(0)>='a'&&str.charAt(0)<='z'&&
        str.charAt(0)>='A'&&str.charAt(0)<='Z')
            return 0;
        int index=0;
        while(index<str.length()&&str.charAt(index)==' '){
            index++;
        }
        if(index==str.length())
            return 0;
        long re=0;
        boolean flag = false;
        if(str.charAt(index)=='-'){
            flag=true;
            index++;
        }else if(str.charAt(index)=='+')
            index++;
        while(index<str.length()&&str.charAt(index)>='0'&&str.charAt(index)<='9'){
            re=re*10+str.charAt(index)-'0';
            index++;
            if(flag)
                re=-re;
            if(re>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(re<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(flag)
                re=-re;
        }
        if(flag)
            re=-re;
        return (int)re;
    }

    public static void main(String[] args){
        q8 q8 = new q8();
        System.out.println(q8.myAtoi("9223372036854775808"));
    }
}
