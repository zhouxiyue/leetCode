public class q7 {
    public int reverse(int x) {
        long re=0;
        while(x!=0){
            int rest=x%10;
            re=re*10+rest;
            if(re>Integer.MAX_VALUE||re<Integer.MIN_VALUE)
                return 0;
            x/=10;
        }
        return (int)re;
    }
}
