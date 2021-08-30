public class q371 {
    public int getSum(int a, int b) {
        if(a==0&&b==0)
            return 0;
        if(a==0)
            return b;
        if(b==0)
            return a;
        int carry=a&b;
        int sum=a^b;
        while(carry!=0){
            int tmp = sum;
            carry=carry&(Integer.MAX_VALUE);
            sum=sum^(carry<<1);
            carry=tmp&(carry<<1);
        }
        return sum;
    }
}
