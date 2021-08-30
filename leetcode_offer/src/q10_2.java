public class q10_2 {
    public int numWays(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int num1=1;
        int num2=2;
        int re = num1+num2;
        for(int i=3;i<n;i++){
            num1=num2;
            num2=re;
            re=(num1+num2)%1000000007;
        }
        return re;
    }

    public static void main(String[] args) {
        q10_2 q10_2 = new q10_2();
        System.out.println(q10_2.numWays(4));
    }
}
