public class q7 {
    public int reverse(int x) {
        if(x==0)return 0;
        long re=0;
        while(x!=0){
            int r=x%10;
            re=10*re+r;
            if(re>Integer.MAX_VALUE||re<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int)re;
    }

    public static void main(String[] args) {
        int num=-123;
        q7 q7=new q7();
        q7.reverse(num);
    }
}
