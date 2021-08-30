public class q29 {
    public int divide(int dividend, int divisor) {
        if(dividend==0)return 0;
        if(dividend==Integer.MIN_VALUE&&divisor==-1)return Integer.MAX_VALUE;
        boolean flag = false;
        flag=(dividend^divisor)<0;
        long d1=Math.abs((long)dividend);
        long d2=Math.abs((long)divisor);
        int result=0;
        for(int i=31;i>=0;i--){
            if((d1>>i)>=d2){
                result+=1<<i;
                d1-=d2<<i;
            }
        }

        return flag?-result:result;
    }
}
