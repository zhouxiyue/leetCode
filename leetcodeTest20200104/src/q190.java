public class q190 {
    public int reverseBits(int n) {
        int i=32;
        int re=0;
        while(i>0){
            re<<=1;
            re+=n&1;
            n>>=1;
            i--;
        }
        return re;
    }
}
