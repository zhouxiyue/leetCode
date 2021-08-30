public class q70 {
    public int climbStairs(int n) {
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}

class q70_1{
    public int climbStairs(int n) {
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
        int num1=1;
        int num2=2;
        int re=0;
        for(int i=3;i<=n;i++){
            re=num1+num2;
            num1=num2;
            num2=re;
        }
        return re;
    }

    public static void main(String[] args) {
        q70_1 q70_1 = new q70_1();
        q70_1.climbStairs(4);
    }
}