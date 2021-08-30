public class q10 {
    public boolean isMatch(String s, String p) {
        return false;
    }
}

class q10_1{
    public boolean isMatch1(String s,String p){
        if(p.isEmpty())
            return s.isEmpty();
        boolean flag = !s.isEmpty()&&s.charAt(0)==p.charAt(0);
        return flag&&isMatch1(s.substring(1,s.length()),p.substring(1,p.length()));
    }

    public boolean isMatch2(String s,String p){
        if(s.isEmpty())
            return p.isEmpty();
        boolean flag = !s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
        return flag&&isMatch2(s.substring(1),p.substring(1));
    }

    public boolean isMatch(String s, String p) {
        if(p.isEmpty())
            return s.isEmpty();
        boolean first_flag = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if( p.length() >= 2 && p.charAt(1) == '*'){
            return first_flag && isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
        }else
            return first_flag && isMatch(s.substring(1), p.substring(1));
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "c*aa*b";
        q10_1 q10_1=new q10_1();
        System.out.println(q10_1.isMatch(s1, s2));
    }
}
