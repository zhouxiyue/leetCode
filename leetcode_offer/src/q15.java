public class q15 {
    public int hammingWeight(int n) {
        int num = 1;
        int re = 0;
        while(num!=0){
            if((n&num)!=0)
                re++;
            num<<=1;
        }
        return re;
    }
}
