public class q171 {
    public int titleToNumber(String s) {
        int re=0;
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'A'+1;
            re=re*26+num;
        }
        return re;
    }
}
