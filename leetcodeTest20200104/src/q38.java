public class q38 {
    public String countAndSay(int n) {
        if(n==0)return "";
        String re = "1";
        for(int i=1;i<n;i++){
            StringBuilder sb = new StringBuilder();
            char c = re.charAt(0);
            int num=1;
            for(int j=1;j<re.length();j++){
                char s = re.charAt(j);
                if(c==s){
                    num++;
                }else{
                    sb.append(num).append(c);
                    c=s;
                    num=1;
                }
            }
            sb.append(num).append(c);
            re=sb.toString();
        }
        return re;
    }

    public static void main(String[] args) {
        q38 q38 = new q38();
        q38.countAndSay(1);
    }
}
