public class q8 {
    public int myAtoi(String str) {
        int result=0;
        String re="";
        if(str.equals(""))return 0;
        if(str.charAt(0)==' '){
            int i=0;
            while(str.charAt(i)==' '){
                i++;
                if(i==str.length())return 0;
            }
            if(i==str.length()-1)return 0;
            else {
                str = str.substring(i, str.length());
            }
        }
        if(!Character.isDigit(str.charAt(0))) {
            if (str.charAt(0) == '-') {
                re += '-';
                str = str.substring(1, str.length());
                if (str.equals("") || !(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
                    return 0;
                }
            }
            else if (str.charAt(0) == '+') {
                re += '+';
                str = str.substring(1, str.length());
                if (str.equals("") || !(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
                    return 0;
                }
            }
            else{
                return 0;
            }
        }
        if(str.charAt(0)>='0'&&str.charAt(0)<='9') {
            int i=0;
            while ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
                i++;
                if(i==str.length())break;
            }
            re+= str.substring(0, i);
            try {
                result = Integer.parseInt(re);
            }catch(Exception e){
                if(re.charAt(0)=='-')result=Integer.MIN_VALUE;
                else{
                    result=Integer.MAX_VALUE;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="9223372036854775808";
        q8 q8 = new q8();
        System.out.println(q8.myAtoi(str));
    }
}
