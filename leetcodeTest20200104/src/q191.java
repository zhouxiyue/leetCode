public class q191 {
    public int hammingWeight(int n) {
        int i=1;
        int num=0;
        while(i!=0){
            if((n&i)!=0)
                num++;
            i<<=1;
        }
        return num;
    }

    public int hammingWeight1(int n) {
        int num=0;
        while(n!=0){
            if((n&1)!=0)
                num++;
            n>>>=1;
        }
        return num;
    }

    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        q191 q191 = new q191();
        q191.hammingWeight(n);
    }
}
