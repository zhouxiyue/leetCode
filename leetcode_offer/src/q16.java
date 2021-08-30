public class q16 {
    public double myPow(double x, int n) {
        if(x==1||x==0)
            return x;
        double re = 1;
        boolean sig = false;
        long N=n;
        if(N<0) {
            N=-N;
            sig = true;
        }
        while(N>0){
            if(N%2==1)
                re*=x;
            N>>=1;
            x=x*x;
        }
        if(sig)
            return 1/re;
        return re;
    }

    public static void main(String[] args) {
        q16 q16 = new q16();
        System.out.println(q16.myPow(2.10000, -2147483648));
    }
}
