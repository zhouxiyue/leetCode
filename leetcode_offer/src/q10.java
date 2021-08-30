public class q10 {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }

    public int fib1(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int num1=1;
        int num2=1;
        int re=0;
        for(int i=2;i<n;i++){
            re=(num1+num2)%1000000007;
            num1=num2;
            num2=re;
        }
        return re;
    }

    public static void main(String[] args) {
        q10 q10 = new q10();
        q10.fib1(2);
    }
}
