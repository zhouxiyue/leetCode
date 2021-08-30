public class q50 {
    public double myPow(double x, int n) {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        double re=0;
        if(n<0){
            int m=-n;
            while(m!=0){
               re*=x;
               m-=1;
            }
            re=1/re;
        }else{
            while(n!=0){
                re*=x;
                n-=1;
            }
        }
        return re;
    }

    public double myPow1(double x, int n) {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n<0){
            x=1/x;
            n=-n;
        }
        return help(x,n);
    }
    public double help(double x, int n) {
        if(n==0)
            return 1;
        double half=help(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }

    public double myPow2(double x, int n) {
        boolean b = false;
        if(n<0) {
            b = true;
            n=-n;
        }
        double re=1;
        while(n!=0){
            if(n%2!=0){
                re*=x;
            }
            x*=x;
            n/=2;
        }
        return b?1/re:re;
    }
}
